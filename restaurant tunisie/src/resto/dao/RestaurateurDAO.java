/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import resto.entities.Restaurateur;
import resto.entities.authentification;
import resto.util.MyConnection;


/**
 *
 * @author Labidi
 */
public class RestaurateurDAO {

    public void ajouterRestaurateur(Restaurateur r,authentification au){

        String requete = "insert into restaurateur(nom, prenom, date_naissance, tel, adresse, sexe, cin, mail) values (?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1, r.getNom());
            ps.setString(2, r.getPrenom());
            ps.setString(3, r.getDate_naissance());
            ps.setInt(4, r.getTel());
            ps.setString(5, r.getAdresse());
            ps.setString(6, r.getSexe());
            ps.setInt(7, r.getCin());
            ps.setString(8, r.getMail());
            
            ps.executeUpdate();
           Restaurateur r2 = this.findRestaurateurByName(r.getNom(),r.getPrenom());
           au.setId_utilisateur(r2.getId_restaurateur_pk());
           String requete1= "insert into authentification values (null,?,?,?,?)";
           PreparedStatement s = MyConnection.getInstance().prepareStatement(requete1) ;
           s.setString(1, au.getLogin());
           s.setString(2, au.getPassword());
           s.setInt(3, au.getId_utilisateur());
           s.setString(4, "Restaurateur");
           s.executeUpdate();
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        

    }

    public void updateRestaurateur(Restaurateur r,authentification au){
        String requete = "update restaurateur set nom=?, prenom=?,date_naissance=?,tel=?,adresse=?,sexe=?,cin=?,mail=? where id_restaurateur_pk=?";
        try {
            new authentificationDAO().updateRes(au);
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,r.getNom());
            ps.setString(2, r.getPrenom());
            ps.setString(3, r.getDate_naissance());
            ps.setInt(4, r.getTel());
            ps.setString(5, r.getAdresse());
            ps.setString(6, r.getSexe());
            ps.setInt(7, r.getCin());
            ps.setString(8,r.getMail());
            ps.setInt(9, r.getId_restaurateur_pk());
            ps.executeUpdate();
            
//            u.setId_utilisateur(r2.getId_restaurateur_pk());
//           String requete1= "insert into authentification values (null,?,?,?,?)";
//           PreparedStatement s = MyConnection.getInstance().prepareStatement(requete1) ;
//           s.setString(1, au.getLogin());
//           s.setString(2, au.getPassword());
//           s.setInt(3, au.getId_utilisateur());
//           s.setString(4, "Restaurateur");
//           s.executeUpdate();
            
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
        
    }


    public void deleteRestaurateur(int id_restaurateur_pk){
        String requete = "delete from restaurateur where id_restaurateur_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_restaurateur_pk);
            ps.executeUpdate();
            new authentificationDAO().deleteRes(id_restaurateur_pk);
            System.out.println("Restaurateur supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Restaurateur findRestaurateurById(int id){
    Restaurateur res = new Restaurateur();
     String requete = "select * from restaurateur where id_restaurateur_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                
                res.setId_restaurateur_pk(resultat.getInt(1));
                res.setNom(resultat.getString(2));
                res.setPrenom(resultat.getString(3));
                res.setDate_naissance(resultat.getString(4));
                res.setTel(resultat.getInt(5));
                res.setAdresse(resultat.getString(6));
                res.setSexe(resultat.getString(7));
                res.setCin(resultat.getInt(8));
                res.setMail(resultat.getString(9));
            }
            return res;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche d'un restaurateur "+ex.getMessage());
            return null;
        }
    }
    
    public Restaurateur findRestaurateurByName(String ch,String ch2){
     String requete = "(select * from restaurateur where nom='"+ch+"' and prenom='"+ch2+"')";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat= ps.executeQuery();
             Restaurateur rest = new Restaurateur();
            while (resultat.next())
            {
              
               
                rest.setNom(resultat.getString(2));
                rest.setPrenom(resultat.getString(3));
                rest.setId_restaurateur_pk(resultat.getInt(1));
            }
            
            return rest;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche d'un restaurateur "+ex.getMessage());
            return null;
        }
    }

   
    
    public List<Restaurateur> RechercherAllRestaurateurs(String ch){
    
   List<Restaurateur> listeR = new ArrayList<Restaurateur>();
     String requete = "(select * from restaurateur where id_restaurateur_pk like '%"+ch+"%') union (select * from restaurateur where nom like '%"+ch+"%') union (select * from restaurateur where prenom like '%"+ch+"%') union (select * from restaurateur where date_naissance like '%"+ch+"%') union (select * from restaurateur where tel like '%"+ch+"%') union (select * from restaurateur where adresse like '%"+ch+"%') union (select * from restaurateur where sexe like '%"+ch+"%')union(select * from restaurateur where cin like'%"+ch+"%')union(select * from restaurateur where mail like'%"+ch+"%')";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                Restaurateur rest = new Restaurateur();
                rest.setId_restaurateur_pk(resultat.getInt(1));
                rest.setNom(resultat.getString(2));
                rest.setPrenom(resultat.getString(3));
                rest.setDate_naissance(resultat.getString(4));
                rest.setTel(resultat.getInt(5));
                rest.setAdresse(resultat.getString(6));
                rest.setSexe(resultat.getString(7));
                rest.setCin(resultat.getInt(8));
                rest.setMail(resultat.getString(9));
                listeR.add(rest);
            }
            return listeR;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche d'un restaurateur"+ex.getMessage());
            return null;
        }
    
}


    public List<Restaurateur> DisplayAllRestaurateurs (){


        List<Restaurateur> listerestaurateur = new ArrayList<Restaurateur>();

        String requete = "select * from restaurateur";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Restaurateur res =new Restaurateur();
                res.setId_restaurateur_pk(resultat.getInt(1));
                res.setNom(resultat.getString(2));
                res.setPrenom(resultat.getString(3));
                res.setDate_naissance(resultat.getString(4));
                res.setTel(resultat.getInt(5));
                res.setAdresse(resultat.getString(6));
                res.setSexe(resultat.getString(7));
                res.setCin(resultat.getInt(8));
                res.setMail(resultat.getString(9));

                listerestaurateur.add(res);
            }
            return listerestaurateur;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des restaurateurs "+ex.getMessage());
            return null;
        }
    }




}