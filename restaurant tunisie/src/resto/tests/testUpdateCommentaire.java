/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tests;

import resto.dao.CommentaireDAO;
import resto.entities.Commentaire;

/**
 *
 * @author user
 */
public class testUpdateCommentaire {
     public static void main(String[] args){

        Commentaire commentaire = new Commentaire();
        CommentaireDAO commentaireDAO = new CommentaireDAO();
        commentaire = commentaireDAO.findCommentaireById(3);
        commentaire.setText("yari");
       commentaireDAO.updateCommentaire(commentaire);
    }
}
