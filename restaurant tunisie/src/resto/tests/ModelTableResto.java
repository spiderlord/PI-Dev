package resto.tests;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import resto.dao.RestaurantDAO;
import resto.entities.Restaurant;

public class ModelTableResto extends AbstractTableModel {

    List<Restaurant> maListe = new ArrayList<>();
    String[] header = {"id", "Nom", "Addresse", "theme", "specialite", "tel", "budget", "alcool", "id_menu_fk"};

    public ModelTableResto() {
            maListe = new RestaurantDAO().DisplayAllResto();
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
            default:
                return null;
        }
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }
}
