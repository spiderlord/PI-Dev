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
public class ClientTestUpdate {
     public static void main(String[] args) {
     Client client = new Client();
       ClientDAO clientDAO = new ClientDAO();
client.setId_client_pk(5);
       // depot = depotDAO.findDepotById(1);
        client.setNom("marzougi");
        client.setDate_naissance(null);
   client.setTel(24286570);
        client.setPrenom("moncef");
        client.setAdresse("carthage");
        client.setSexe("tartour");
    clientDAO.updateClient(client);
     

}
    
}
