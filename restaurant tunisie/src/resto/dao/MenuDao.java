/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import resto.entities.Menu;
import resto.util.MyConnection;

/**
 *
 * @author Boss
 */
public class MenuDao {
    
public void insertRestaurant(Menu R) {

        String requete = "insert into Menu (id_resto_pk) values (?)";
        try {
PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);            ps.setInt(1, R.getId_menu_pk());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
    
    public void deleteRestaurant(int id){
        String requete = "delete from restaurant where Id_resto_pk=?";
        try {
PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);            ps.setInt(1, id);
           ps.executeUpdate();
            System.out.println("Restaurant supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    public void updateRestaurant(Menu R){
        String requete = "update menu set Id_menu_pk=? where Id_resto_pk=?";
        try {
        PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);            ps.setInt(1, R.getId_menu_pk());
            
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
    
  
}

