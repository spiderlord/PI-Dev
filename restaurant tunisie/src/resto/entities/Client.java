/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.entities;



/**
 *
 * @author Administrateur
 */
public class Client {
    private int id_client_pk;
    private String nom;
    private String prenom;

   
    private String date_naissance;
  private String mail;
  private String adresse;
private int tel;
      private String sexe;

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }
      
       public String getDate_naissance() {
        return date_naissance;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
  
  
    public String getMail() {
        return mail;
    }
  

   
    

    
 

    public Client() {
        
    }

    @Override
    public String toString() {
        return "Client{" + "id_client_pk=" + id_client_pk + ", nom=" + nom + ", prenom=" + prenom + ", date_naissance=" + date_naissance + ", mail=" + mail + ", adresse=" + adresse + ", tel=" + tel + ", sexe=" + sexe + '}';
    }


 

   

    /**
     * @return the id_client_pk
     */
    public int getId_client_pk() {
        return id_client_pk;
    }

    /**
     * @param id_client_pk the id_client_pk to set
     */
    public void setId_client_pk(int id_client_pk) {
        this.id_client_pk = id_client_pk;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

  

    /**
     * @return the tel
     */
    public int getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int id_client_pk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    /**
     * @return the date_naissance
     */
 

    /**
     * @param date_naissance the date_naissance to set
     */
   

    
}
