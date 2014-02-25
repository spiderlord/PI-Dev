/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tests;

import resto.dao.ClientDAO;
import resto.entities.Client;

/**
 *
 * @author Administrateur
 */
public class ClientTestSupprimer {
    public static void main(String[] args) {
        Client client = new Client();
        ClientDAO clientDAO = new ClientDAO();
   
        clientDAO.deleteClient(2);
    }
    
}
