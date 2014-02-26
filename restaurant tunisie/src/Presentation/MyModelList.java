/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import resto.dao.ClientDAO;
import resto.entities.Client;

/**
 *
 * @author Administrateur
 */
public class MyModelList extends AbstractTableModel{
List<Client> maliste = new ArrayList<Client>();
     String[] header ={"id_client_pk","Nom","Prenom","date_naissance","tel","adresse","sexe","Supprimer"};       
     Boolean data[][]= new Boolean[20][20];
    
    
   
    public MyModelList(){
    maliste = new ClientDAO().DisplayAllClient();
    for(int i=0;i<getRowCount();i++){
        data[i][7]=Boolean.FALSE;
}
}
    
@Override
    public int getRowCount() {
    return maliste.size();
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
        Boolean b = (Boolean)aValue;
        if(columnIndex==7){
            
            data[rowIndex][7]=b;
        }}

    @Override
    public int getColumnCount() {
       return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:return maliste.get(rowIndex).getId_client_pk();
            case 1:return maliste.get(rowIndex).getNom();
            case 2:return maliste.get(rowIndex).getPrenom();
            case 3:return maliste.get(rowIndex).getDate_naissance();
            case 4:return maliste.get(rowIndex).getTel();
            case 5:return maliste.get(rowIndex).getAdresse();
            case 6:return maliste.get(rowIndex).getSexe();
            
            case 7:return data[rowIndex][7];   
           
                default:return null;
                
    }}
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       
        if(columnIndex==7){
            return true;
        }
        return false;
    }
    public String getColumnName(int coIumnIndex){
        return header[coIumnIndex];
    }


    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==7){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }
   
}
