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
public class testAddCommentaire {
    public static void main(String[] args){
        Commentaire comment = new Commentaire();
        CommentaireDAO commentaireDAO = new CommentaireDAO();
        comment.setText("premier insertion avec test");
        commentaireDAO.insertCommentaire(comment);
    }
        



}
