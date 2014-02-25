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

    public void insertCommentaire(Commentaire c){
        String requete = "insert into commentaire (texte) values (?)";
        try {
           PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getText());
            ps.executeUpdate();
            System.out.println("Ajout s'est effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(CommentaireDAO.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("erreur lors de l'insertion "+ex.getMessage());

        }


    }

     public void deleteCommentaire(Commentaire c){
        String requete = "delete from commentaire where id_coms_pk=?";
        try {
            PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
           
            ps.setInt(1, c.getIdcommentaire());
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


        List<Commentaire> listeCommentaire = new ArrayList<Commentaire>();

        String requete = "select * from commentaire";
        try {
           Statement statement = (Statement) MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = (ResultSet) statement.executeQuery(requete);

            while(resultat.next()){
                Commentaire commentaire =new Commentaire();
                commentaire.setIdcommentaire(resultat.getInt(1));
                commentaire.setText(resultat.getString(2));

                listeCommentaire.add(commentaire);
            }
            return listeCommentaire;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }

}
