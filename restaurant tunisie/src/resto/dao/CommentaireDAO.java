/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.dao;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import resto.entities.Commentaire;
import resto.util.MyConnection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CommentaireDAO {
    
     public java.sql.Date getCurrentDate() {
    java.util.Date today = new java.util.Date();
    return new java.sql.Date(today.getTime());
}
     

    public void insertCommentaire(Commentaire c){
        String requete = "insert into commentaire (texte, Date) values (?,?)";
        try {
           PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getText());
            java.sql.Date date = getCurrentDate();
                ps.setDate(2, date);
            
            ps.executeUpdate();
            System.out.println("Ajout s'est effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(CommentaireDAO.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("erreur lors de l'insertion "+ex.getMessage());

        }


    }

     public void deleteCommentaire(int c){
        String requete = "delete from commentaire where id_coms_pk=?";
        try {
            PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
           
            ps.setInt(1, c);
            ps.executeUpdate();
            System.out.println(" supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


      public Commentaire findCommentaireById(int id ){
    Commentaire commentaire = new Commentaire();
     String requete = "select * from commentaire where id_coms_pk=?";
        try {
            PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = (ResultSet) ps.executeQuery();
            while (resultat.next())
            {
                commentaire.setIdcommentaire(resultat.getInt(1));
                commentaire.setText(resultat.getString(2));
               
            }
            return commentaire;
          

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }


      public void updateCommentaire(Commentaire c){
        String requete = "update commentaire set texte=? where id_coms_pk=?";
        try {
            PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getText());
            ps.setInt(2, c.getIdcommentaire());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

       public List<Commentaire> DisplayAllCommentaire(){


        List<Commentaire> listeCommentaire = new ArrayList<>();

        String requete = "select * from commentaire";
        try {
           Statement statement = (Statement) MyConnection.getInstance().createStatement();
            ResultSet resultat = (ResultSet) statement.executeQuery(requete);

            while(resultat.next()){
                Commentaire commentaire =new Commentaire();
                commentaire.setIdcommentaire(resultat.getInt(1));
                commentaire.setText(resultat.getString(2));
                commentaire.setDates(resultat.getDate(3));
               
              //  System.out.println(resultat.getDate(3));
                
                listeCommentaire.add(commentaire);
            }
            return listeCommentaire;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des commentaires "+ex.getMessage());
            return null;
        }
    }

}
