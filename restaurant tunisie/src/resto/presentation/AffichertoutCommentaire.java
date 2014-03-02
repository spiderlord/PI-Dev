/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.presentation;

import resto.dao.CommentaireDAO;
import resto.entities.Commentaire;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import resto.dao.ClientDAO;
import resto.dao.RestaurantDAO;
import resto.dao.RestaurateurDAO;
import resto.entities.Restaurant;



/**
 *
 * @author user
 */
public class AffichertoutCommentaire extends AbstractTableModel{

    List <Commentaire> commentaires;
    String [] columTab = {"Identifiant","Nom restaurant","Commentaire","Nom Utilisateur ","La Date du commentaire","Supprimer "};
     Boolean data[][]= new Boolean[20][20];
   List<Restaurant> restaurants;
   
    
    
    public AffichertoutCommentaire(){
         
      
      
        CommentaireDAO commentaireDAO = new CommentaireDAO();
        commentaires = commentaireDAO.DisplayAllCommentaire();
        
          for(int i=0;i<getRowCount();i++){
        data[i][5]=Boolean.FALSE;
}
        
        
  
    }

    @Override
    public int getRowCount() {
         return  commentaires.size();
    }

  
    @Override
     public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
        Boolean b = (Boolean)aValue;
        if(columnIndex==5){
            
            data[rowIndex][5]=b;
        }}
     
       public int getColumnCount() {
         return columTab.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
       {
          case 0 : return commentaires.get(rowIndex).getIdcommentaire();
          case 1 : return new RestaurantDAO().findRestoByID(commentaires.get(rowIndex).getId_resto_fk()).getNom();
          case 2 : return commentaires.get(rowIndex).getText();
          case 3 : {String ch=commentaires.get(rowIndex).getType();
             
              if(ch.equals("Client")){
              return new ClientDAO().RechercherClient(commentaires.get(rowIndex).getId_utilisateur_fk()).getNom();
              }
              if(ch.equals("Restaurateur")){
              return new RestaurateurDAO().findRestaurateurById(commentaires.get(rowIndex).getId_utilisateur_fk()).getNom();
              }
              if(ch.equals("Administrateur")){
              return "Administrateur";
              }
          }
          case 4 : return commentaires.get(rowIndex).getDates();
          case 5:{
             
          return data[rowIndex][5];}
          default: return null;
       }
    }

     @Override
     public String getColumnName(int column) {
       return  columTab[column];
    }
     
     public boolean isCellEditable(int rowIndex, int columnIndex) {
       
        if(columnIndex==5){
            return true;
        }
        return false;
    }
        
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==5){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }
     

}
