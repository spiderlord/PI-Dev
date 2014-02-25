/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.presentation;

import resto.dao.CommentaireDAO;
import resto.entities.Commentaire;
import java.util.List;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author user
 */
public class AffichertoutCommentaire extends AbstractTableModel{

    List <Commentaire> commentaires;
    String [] columTab = {"Identif", "Commentaire"};
    public AffichertoutCommentaire(){
        CommentaireDAO commentaireDAO = new CommentaireDAO();
        commentaires = commentaireDAO.DisplayAllCommentaire();

    }

    public int getRowCount() {
         return  commentaires.size();
    }

    public int getColumnCount() {
         return columTab.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
       {
          case 0 : return commentaires.get(rowIndex).getIdcommentaire();
          case 1 : return commentaires.get(rowIndex).getText();
          default: return null;
       }
    }

     @Override
     public String getColumnName(int column) {
       return  columTab[column];
    }

}
