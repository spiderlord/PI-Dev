/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tests;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import resto.dao.RestaurateurDAO;
import resto.entities.Restaurateur;

/**
 *
 * @author Labidi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Ajouter
//      Date d = new  Date();
//       Restaurateur res = new Restaurateur(2,"khaled", "labdidi", "51", 2400662, "null", "femme", 61313212);
//      RestaurateurDAO resDAO= new RestaurateurDAO();
//       resDAO.ajouterRestaurateur(res);

        //Modifier

        Restaurateur res = new Restaurateur(10, "fares", "ddddddd"," 01/01/01", 0215, "aaaa", "Homme", 012,"fares@hotmail.fr");
        RestaurateurDAO resDAO = new RestaurateurDAO();
        resDAO.updateRestaurateur(res);
        res.setId_restaurateur_pk(10);
        res.setPrenom("bbbbb");
        res.setAdresse("Allemagne");
        res.setMail("ali@esprit.tn");
        resDAO.updateRestaurateur(res);
        System.out.println(res);
        System.out.println(res.getMail());
        

        //supprimer
//
//        Restaurateur res = new Restaurateur();
//        RestaurateurDAO resDAO = new RestaurateurDAO();
//        resDAO.deleteRestaurateur(5);

        //rechercheById

//        Restaurateur res = new Restaurateur();
//        RestaurateurDAO resDAO = new RestaurateurDAO();
//        res=resDAO.findRestaurateurById(2);
//        System.out.println(res);

        //rechercehByAdresse

//        Restaurateur res = new Restaurateur();
//        RestaurateurDAO resDAO = new RestaurateurDAO();
//        res=resDAO.findRestaurateurByAdresse("null");
//        System.out.println(res);

        //Affichage
       

       

        






        
        

    }

}
