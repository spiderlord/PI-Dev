/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
     
public void updateClient(Client c){
        String requete = "update client set nom=?,prenom=?,date_naissance=?,tel=?,adresse=?,sexe=? where id_client_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setDate(3, (Date) c.getDate_naissance());
            ps.setInt(4, c.getTel());
            ps.setString(5, c.getAdresse());
            ps.setString(6, c.getSexe());
           
           ps.setInt(7, c.getId_client_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
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
    
    
     public Client RechercherClient(int id){
    Client client = new Client();
     String requete = "select * from client where id_client_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                client.setId_client_pk(resultat.getInt(1));
            
               client.setAdresse(resultat.getString(2));
            }
            return client;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du client "+ex.getMessage());
            return null;
        }
    
}
       public List<Client> DisplayAllDepots (){
          List<Client> listedepots = new ArrayList<Client>();

        String requete = "select * from client";
        try {
           Statement statement = MyConnection.getInstance()   
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Client client =new Client();
                client.setId_client_pk(resultat.getInt(1));
                client.setAdresse(resultat.getString(2));

                listedepots.add(client);
            }
            return listedepots;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
} 
     
