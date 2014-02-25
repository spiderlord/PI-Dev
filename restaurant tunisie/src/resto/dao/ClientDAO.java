/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import resto.entities.Client;
import resto.util.MyConnection;

/**
 *
 * @author Administrateur
 */
public class ClientDAO {
     public void insertClient(Client c) {

        String requete = "insert into client (nom,prenom,date_naissance,tel,adresse,sexe) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps= MyConnection.getInstance().prepareStatement(requete);
           
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setDate(3, (Date) c.getDate_naissance());
            ps.setString(5, c.getAdresse());
            ps.setString(6, c.getSexe());
          
           ps.setInt(4, c.getTel());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }


    public void deleteClient(int id){
        String requete = "delete from client where id_client_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
           ps.executeUpdate();
            System.out.println("client supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
}
