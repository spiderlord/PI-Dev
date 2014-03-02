/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import resto.dao.ClientDAO;
import resto.dao.authentificationDAO;
import resto.entities.Client;

/**
 *
 * @author Administrateur
 */
public class MyModelList extends AbstractTableModel{
List<Client> maliste = new ArrayList<Client>();
     String[] header ={"Nom","Prenom","date_naissance","tel","adresse","sexe","mail","login","Supprimer",""};       
     Boolean data[][]= new Boolean[20][20];
    
    
     
   
    public MyModelList(){
    maliste = new ClientDAO().DisplayAllClient();
    for(int i=0;i<getRowCount();i++){
        data[i][8]=Boolean.FALSE;
}
}
    public MyModelList(Object obj){
    maliste=(List<Client>) obj;
    for(int i=0;i<getRowCount();i++){
        data[i][8]=Boolean.FALSE;
}
}
@Override
    public int getRowCount() {
    return maliste.size();
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
        Boolean b = (Boolean)aValue;
        if(columnIndex==8){
            
            data[rowIndex][8]=b;
        }}

    @Override
    public int getColumnCount() {
       return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            
            case 0:return maliste.get(rowIndex).getNom();
            case 1:return maliste.get(rowIndex).getPrenom();
            case 2:return (maliste.get(rowIndex).getDate_naissance());
            case 3:return maliste.get(rowIndex).getTel();
            case 4:return maliste.get(rowIndex).getAdresse();
            case 5:return maliste.get(rowIndex).getSexe();
              case 6:return maliste.get(rowIndex).getMail();
              case 7:return new authentificationDAO().recherchecli(maliste.get(rowIndex).getId_client_pk()).getLogin();
            case 8:return data[rowIndex][8];   
                  case 9:return maliste.get(rowIndex).getId_client_pk();
              
           
                default:return null;
                
    }}
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       
        if(columnIndex==8){
            return true;
        }
        return false;
    }
    public String getColumnName(int coIumnIndex){
        return header[coIumnIndex];
    }


    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==8){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }
   
}
