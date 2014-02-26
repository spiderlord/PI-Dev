/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.entities;

import java.util.Objects;

/**
 *
 * @author dali
 */
public class authentification {
    private int id;
    private String login;
    private String password;
    private int id_utilisateur;
    private String type;
    
   
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final authentification other = (authentification) obj;
        if (!Objects.equals(this.login, other.login)) {
            System.out.println(other.login);
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            System.out.println(other.password);
            return false;
        }      
        System.out.println("ok");
        
        return true;
    }

    public authentification() {
    }

    public authentification(int id, String login, String password, int id_utilisateur, String type) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.id_utilisateur = id_utilisateur;
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public String getType() {
        return type;
    }

    
}
