

package resto.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    @SuppressWarnings("empty-statement")
    public authentification verifier(String ch)
    {
        authentification auth=new authentification();
        String requete = "select * from authentification where Login='"+ch+"' and Type='Administrateur'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while (resultat.next());
            {
                System.out.println("test1:");
                auth.setId(resultat.getInt("Id_authentification_pk"));
                System.out.println("test2:");
                auth.setLogin(resultat.getString(2));
                System.out.println("test3:");
                auth.setPassword(resultat.getString(3));
                System.out.println("test4:");
                auth.setId_utilisateur(resultat.getInt(4));
                System.out.println("test5:");
                auth.setType(resultat.getString(5));  
                System.out.println("test6:");
                
            }
            
            return auth;
            
          
        } catch (SQLException ex) {
            System.out.println("cat");
        }
        return null;
        
        
    }
    
}
