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
public class testupdateResto {
    public static void main(String[] args) {

        Restaurant resto = new Restaurant("a","a","a","a",1,2,"a",7);
        resto.setId_resto_pk(1);
        RestaurantDAO depotDAO = new RestaurantDAO();
        depotDAO.updateRestaurant(resto);
    }
    
}
