package resto.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import resto.dao.RestaurantDAO;
import resto.entities.Restaurant;

public class ModelTable extends AbstractTableModel {

    
    List<Restaurant> maListe = new ArrayList<Restaurant>();
    String[] header = {"id", "Nom", "Addresse", "theme", "specialite", "tel", "budget", "alcool", "id_menu_fk","Num restaurateur","mail"};
    Boolean data[][]= new Boolean[20][20];
    
    public ModelTable() {
            maListe = new RestaurantDAO().DisplayAllResto();
            for(int i=0;i<getRowCount();i++){
                data[i][11]=Boolean.FALSE;
            }
    }

   

    
    @Override
    public int getRowCount() {
        return maListe.size();
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return maListe.get(rowIndex).getId_resto_pk();
            case 1:
                return maListe.get(rowIndex).getNom();
            case 2:
                return maListe.get(rowIndex).getAdresse();
            case 3:
                return maListe.get(rowIndex).getTheme();
            case 4:
                return maListe.get(rowIndex).getSpecialite();
            case 5:
                return maListe.get(rowIndex).getTel();
            case 6:
                return maListe.get(rowIndex).getBudget();
            case 7:
                return maListe.get(rowIndex).getAlcool();
            case 8:
                return maListe.get(rowIndex).getId_menu_fk();
            case 9:
                return maListe.get(rowIndex).getId_restaurateur_fk();
            case 10:
                return maListe.get(rowIndex).getMail();
            case 11:
                return data[rowIndex][11];   
            default:
                return null;
        }
    }
    
//    @Override
     public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
        Boolean b = (Boolean)aValue;
        if(columnIndex==11){
            
            data[rowIndex][11]=b;
        }}

    @Override
    public int getColumnCount() {
        return header.length;
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       
        if(columnIndex==11){
            return true;
        }
        return false;
    }
        
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==11){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }
    
    public ModelTable(Object obj){
    maListe=(List<Restaurant>) obj;
    for(int i=0;i<getRowCount();i++){
        data[i][11]=Boolean.FALSE;
}
}
}
