/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import resto.dao.RestaurateurDAO;
import resto.dao.authentificationDAO;
import resto.entities.Restaurateur;
import resto.entities.authentification;

/**
 *
 * @author fares
 */
public class ModelTableRestaurateurs extends AbstractTableModel{
    
    List<Restaurateur> maliste = new ArrayList<Restaurateur>();

     String[] header ={"Nom","Prenom","date_naissance","tel","adresse","sexe","cin","Mail","Login","Supprimer"};       
     Boolean data[][]= new Boolean[20][20];
    
    public ModelTableRestaurateurs(){
    
    maliste = new RestaurateurDAO().DisplayAllRestaurateurs();
    for(int i=0;i<getRowCount();i++){
        data[i][9]=Boolean.FALSE;
    }
}

      public ModelTableRestaurateurs(Object obj){
    maliste=(List<Restaurateur>) obj;
    for(int i=0;i<getRowCount();i++){
        data[i][9]=Boolean.FALSE;
}
}
    
    public int getRowCount() {
        
        return maliste.size();
        
    }
    
   

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
        Boolean b = (Boolean)aValue;
        if(columnIndex==9){
            
            data[rowIndex][9]=b;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       
        if(columnIndex==9){
            return true;
        }
        return false;
    }
    
    

    public int getColumnCount() {
       
        return header.length;
    }
    
    public String getColumnName(int coIumnIndex){
        return header[coIumnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
       
        switch(columnIndex){
            case 10:return maliste.get(rowIndex).getId_restaurateur_pk();
            case 0:return maliste.get(rowIndex).getNom();
            case 1:return maliste.get(rowIndex).getPrenom();
            case 2:return maliste.get(rowIndex).getDate_naissance();
            case 3:return maliste.get(rowIndex).getTel();
            case 4:return maliste.get(rowIndex).getAdresse();
            case 5:return maliste.get(rowIndex).getSexe();
            case 6:return maliste.get(rowIndex).getCin();
            case 7:return maliste.get(rowIndex).getMail();
            case 8:return new authentificationDAO().rechercheres(maliste.get(rowIndex).getId_restaurateur_pk()).getLogin();
        
            case 9:return data[rowIndex][10];   
            
                default:return null;
                
        }
         
    }
    
    

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==9){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }
    
    
  
    
   
    
    
    
}
