
package resto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    public authentification verifier(String ch)
    {
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
    
}
