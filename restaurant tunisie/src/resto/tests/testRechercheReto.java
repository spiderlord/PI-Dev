/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.tests;

import resto.dao.RestaurantDAO;
import resto.entities.Restaurant;

/**
 *
 * @author Boss
 */
public class testRechercheReto {

    public static void main(String[] args) {

        Restaurant resto = new Restaurant();
        RestaurantDAO depotDAO = new RestaurantDAO();
        resto = depotDAO.findRestoById(2);
        System.out.println(""+resto.toString());
    }
}
