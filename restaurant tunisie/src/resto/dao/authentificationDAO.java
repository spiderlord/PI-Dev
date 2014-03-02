
package resto.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import resto.entities.authentification;
import resto.util.MyConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dali
 */
public class authentificationDAO {

    public authentificationDAO() {
    }
    public authentification verifier(String ch){
        try {
            
            String requete = "select * from authentification where Login='"+ch+"' and Type='Administrateur'";
            
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
          
            
            while (resultat.next())
            {
                authentification auth=new authentification();
                auth.setId(resultat.getInt(1));
                auth.setLogin(resultat.getString(2));
                auth.setPassword(resultat.getString(3));
                auth.setId_utilisateur(resultat.getInt(4));
                auth.setType(resultat.getString(5));  
                
                return auth;
                
            }
                     
         
        } catch (SQLException ex) {
            System.out.println("erreur");
        }
        return null;
        
        
    }
    public authentification verifierR(String ch){
        try {
            
            String requete = "select * from authentification where Login='"+ch+"' and Type='Restaurateur'";
            
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
           
           
            
             authentification auth=new authentification();
                auth.setId(0);
                auth.setLogin("");
                auth.setPassword("");
                auth.setId_utilisateur(0);
                auth.setType("");  
            while (resultat.next())
            {
                
                auth.setId(resultat.getInt(1));
                auth.setLogin(resultat.getString(2));
                auth.setPassword(resultat.getString(3));
                auth.setId_utilisateur(resultat.getInt(4));
                auth.setType(resultat.getString(5));  
          
              
                
            }
                  
                       return auth;
         
        } catch (SQLException ex) {
            System.out.println("erreur");
        }
        return null;
        
        
    }
    public authentification verifierc(String ch){
        try {
            
            String requete = "select * from authentification where Login='"+ch+"' and Type='Client'";
            
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
           
           
            
             authentification auth=new authentification();
                auth.setId(0);
                auth.setLogin("");
                auth.setPassword("");
                auth.setId_utilisateur(0);
                auth.setType("");  
            while (resultat.next())
            {
                
                auth.setId(resultat.getInt(1));
                auth.setLogin(resultat.getString(2));
                auth.setPassword(resultat.getString(3));
                auth.setId_utilisateur(resultat.getInt(4));
                auth.setType(resultat.getString(5));  
          
              
                
            }
                  
                       return auth;
         
        } catch (SQLException ex) {
            System.out.println("erreur");
        }
        return null;
        
        
    }
    public authentification rechercheres(int id_restaurateur_fk){
        try {
            
            String requete = "select * from authentification where Id_utilisateur_fk="+id_restaurateur_fk+" and Type='Restaurateur'";
            
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
          
            
            while (resultat.next())
            {
                authentification auth=new authentification();
                auth.setId(resultat.getInt(1));
                auth.setLogin(resultat.getString(2));
                auth.setPassword(resultat.getString(3));
                auth.setId_utilisateur(resultat.getInt(4));
                auth.setType(resultat.getString(5));  
                
                return auth;
                
            }
                     
         
        } catch (SQLException ex) {
            System.out.println("erreur");
        }
        return null;
        
        
    }
    public authentification recherchecli(int id_client_fk){
        try {
            
            String requete = "select * from authentification where Id_utilisateur_fk="+id_client_fk+" and Type='Client'";
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
          
            
            while (resultat.next())
            {
                authentification auth=new authentification();
                auth.setId(resultat.getInt(1));
                auth.setLogin(resultat.getString(2));
                auth.setPassword(resultat.getString(3));
                auth.setId_utilisateur(resultat.getInt(4));
                auth.setType(resultat.getString(5));  
                
                return auth;
                
            }
                     
         
        } catch (SQLException ex) {
            System.out.println("erreur");
        }
        return null;
        
        
    }  
    public void deleteRes(int id_restaurateur_fk){
        String requete = "delete from authentification where Id_utilisateur_fk=? and Type='Restaurateur'";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_restaurateur_fk);
            ps.executeUpdate();
           
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    } 
    public void deletecli(int id){
        String requete = "delete from authentification where Id_utilisateur_fk=? and Type='Client'";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
           } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }  
    public void update(authentification au){
        try {
            String requete = "update authentification set Login=?,Password=?,Id_utilisateur_fk=? where Id_authentification_pk=?";
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, au.getLogin());
            ps.setString(2, au.getPassword());
            ps.setInt(3, au.getId_utilisateur());
            ps.setInt(4, au.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(authentificationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    public void updateRes(authentification au){
        try {
            String requete = "update authentification set Login=?,Password=?,Id_utilisateur_fk=? where Id_authentification_pk=?";
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, au.getLogin());
            ps.setString(2, au.getPassword());
            ps.setInt(3, au.getId_utilisateur());
            ps.setInt(4, au.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(authentificationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
