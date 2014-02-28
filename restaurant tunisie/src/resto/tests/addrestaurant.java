/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tests;

import java.util.List;
import resto.dao.RestaurantDAO;
import resto.entities.Restaurant;

/**
 *
 * @author user
 */
public class addrestaurant {
    
    public static void main(String[] args){
         List <Restaurant> restaurant;
        Restaurant resto = new Restaurant();
        RestaurantDAO RestaurantDAO = new RestaurantDAO();
        
        RestaurantDAO.insertRestaurant(resto);
        
        
    }
    
}
