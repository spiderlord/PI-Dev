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
public class testdeleteCommentaire {
     public static void main(String[] args){
        Commentaire commentaire = new Commentaire();
        CommentaireDAO commentaireDAO = new CommentaireDAO();
       // commentaire = commentaireDAO.findCommentaireById(1);
        commentaireDAO.deleteCommentaire(1);
       

        
       
    }


}
