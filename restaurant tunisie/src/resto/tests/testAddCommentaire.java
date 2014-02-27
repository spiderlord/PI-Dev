/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tests;

import java.util.List;
import resto.dao.CommentaireDAO;
import resto.entities.Commentaire;

/**
 *
 * @author user
 */
public class testAddCommentaire {
    public static void main(String[] args){
         List <Commentaire> commentaires;
        Commentaire comment = new Commentaire();
        CommentaireDAO commentaireDAO = new CommentaireDAO();
        comment.setText("6eme insertion avec test");
        commentaireDAO.insertCommentaire(comment);
        
        
    }
        



}
