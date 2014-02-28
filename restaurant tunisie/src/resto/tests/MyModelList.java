/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tests;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrateur
 */
public final class MyModelList extends AbstractTableModel{

     String[] header ={"id","object","Prenom","date_naissance","tel","adresse","sexe"};       
     Boolean data[][]= new Boolean[7][7];
    
    List<Mail> maliste;
     
   
    public MyModelList(){
    }
    public MyModelList(String userMail, String password, int max) throws Exception{
    maliste=new MailfetchingPop3().printAllMessages();
        System.out.println("test validé");
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
            case 0:return maliste.get(rowIndex).getEmailNumber();
            case 1:return maliste.get(rowIndex).getEmailObject();
            case 2:return maliste.get(rowIndex).getEmailReceiver();
            case 3:return maliste.get(rowIndex).getEmailSender();
            case 4:return maliste.get(rowIndex).getEmailSubject();
            case 5:return maliste.get(rowIndex).getDate();
            case 6:return maliste.get(rowIndex).getPwdSender();
            
            case 7:return data[rowIndex][7];   
           
                default:return null;
                
    }}
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex==7;
    }
     @Override
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
