package resto.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import resto.entities.Restaurant;
import resto.util.MyConnection;

public class RestaurantDAO {
    
    public void insertRestaurant(Restaurant R) {

        String requete = "insert into restaurant (id_resto_pk,nom,adresse,theme,specialite,tel,budget,alcool,id_menu_fk,id_restaurateur_fk,mail) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps= MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, R.getId_resto_pk());
            ps.setString(2, R.getNom());
            ps.setString(3, R.getAdresse());
            ps.setString(4, R.getTheme());
            ps.setString(5, R.getSpecialite());
            ps.setInt(6, R.getTel());
            ps.setInt(7, R.getBudget());
            ps.setString(8, R.getAlcool());
            ps.setInt(9, R.getId_menu_fk());
            ps.setInt(10,R.getId_restaurateur_fk());
            ps.setString(11,R.getMail());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
    
    public void deleteRestaurant(int id){
        String requete = "delete from restaurant where Id_resto_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
           ps.executeUpdate();
            System.out.println("Restaurant supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    public void updateRestaurant(Restaurant R){
        String requete = "update restaurant set nom=? ,adresse=? ,theme=? ,specialite=? ,tel=? ,budget=? ,alcool=? ,id_menu_fk=?, id_restaurateur_fk=? , mail=? where Id_resto_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, R.getNom());
            ps.setString(2, R.getAdresse());
            ps.setString(3, R.getTheme());
            ps.setString(4, R.getSpecialite());
            ps.setInt(5, R.getTel());
            ps.setInt(6, R.getBudget());
            ps.setString(7, R.getAlcool());
            ps.setInt(8, R.getId_menu_fk());
            ps.setInt(9, R.getId_restaurateur_fk());
            ps.setString(10, R.getMail());
            ps.setInt(11, R.getId_resto_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
     public Restaurant findRestoByID(int  id){
    Restaurant R = new Restaurant();
     String requete = "select * from restaurant where id_resto_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                R.setId_resto_pk(resultat.getInt(1));
                R.setNom(resultat.getString(2));
                R.setAdresse(resultat.getString(3));
                R.setTheme(resultat.getString(4));
                R.setSpecialite(resultat.getString(5));
                R.setTel(resultat.getInt(6));
                R.setBudget(resultat.getInt(7));
                R.setAlcool(resultat.getString(8));
                R.setId_menu_fk(resultat.getInt(9));
                R.setId_restaurateur_fk(resultat.getInt(10));
                R.setMail(resultat.getString(11));
            }
            return R;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Restaurant "+ex.getMessage());
            return null;
        }
    }
      public List<Restaurant> RechercherAllClient(String ch){
    
   List<Restaurant> listeRes = new ArrayList<Restaurant>();
     String requete = "(select * from restaurant where id_resto_pk like '%"+ch+"%') union (select * from restaurant where nom like '%"+ch+"%') union (select * from restaurant where adresse like '%"+ch+"%') union (select * from restaurant where theme like '%"+ch+"%') union (select * from restaurant where specialite like '%"+ch+"%') union (select * from restaurant where tel like '%"+ch+"%') union (select * from restaurant where budget like '%"+ch+"%')union(select * from restaurant where alcool like'%"+ch+"%')union(select * from restaurant where id_menu_fk like '%"+ch+"%')union(select * from restaurant where id_restaurateur_fk like '%"+ch+"%')union (select * from restaurant where mail like '%"+ch+"%') ";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                Restaurant R=new Restaurant();
                 R.setId_resto_pk(resultat.getInt(1));
                R.setNom(resultat.getString(2));
                R.setAdresse(resultat.getString(3));
                R.setTheme(resultat.getString(4));
                R.setSpecialite(resultat.getString(5));
                R.setTel(resultat.getInt(6));
                R.setBudget(resultat.getInt(7));
                R.setAlcool(resultat.getString(8));
                R.setId_menu_fk(resultat.getInt(9));
                R.setId_restaurateur_fk(resultat.getInt(10));
                R.setMail(resultat.getString(11));
              listeRes.add(R);
            }
            return listeRes;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du client "+ex.getMessage());
            return null;
        }
    
}    
    public List<Restaurant> DisplayAllResto (){
    List<Restaurant> listeResto = new ArrayList<Restaurant>();

        String requete = "select * from restaurant";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Restaurant R =new Restaurant();
                R.setId_resto_pk(resultat.getInt(1));
                R.setNom(resultat.getString(2));
                R.setAdresse(resultat.getString(3));
                R.setTheme(resultat.getString(4));
                R.setSpecialite(resultat.getString(5));
                R.setTel(resultat.getInt(6));
                R.setBudget(resultat.getInt(7));
                R.setAlcool(resultat.getString(8));
                R.setId_menu_fk(resultat.getInt(9));
                R.setId_restaurateur_fk(resultat.getInt(10));
                R.setMail(resultat.getString(11));
                listeResto.add(R);
            }
            return listeResto;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
}
