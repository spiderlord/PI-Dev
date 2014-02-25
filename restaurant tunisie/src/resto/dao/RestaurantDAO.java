package resto.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import resto.entities.Restaurant;
import resto.util.MyConnection;
public class RestaurantDAO {
    
    public void insertRestaurant(Restaurant R) {

        String requete = "insert into restaurant (nom,adresse,theme,specialite,tel,budget,alcool,id_menu_fk) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps= MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1, R.getNom());
            ps.setString(2, R.getAdresse());
            ps.setString(3, R.getTheme());
            ps.setString(4, R.getSpecialite());
            ps.setInt(5, R.getTel());
            ps.setInt(6, R.getBudget());
            ps.setString(7, R.getAlcool());
            ps.setInt(8, R.getId_menu_fk());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
    
     public Restaurant findRestoById(int id){
    Restaurant R = new Restaurant();
     String requete = "select * from restaurant where id_resto_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                R.setId_resto_pk(resultat.getInt(1));
                R.setNom(resultat.getString(2));
                R.setAdresse(resultat.getString(3));
                R.setTheme(resultat.getString(4));
                R.setSpecialite(resultat.getString(5));
                R.setTel(resultat.getInt(6));
                R.setBudget(resultat.getInt(7));
                R.setAlcool(resultat.getString(8));
                R.setId_menu_fk(resultat.getInt(9));
            }
            return R;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Restaurant "+ex.getMessage());
            return null;
        }
    }
     
    public void deleteRestaurant(int id){
        String requete = "delete from restaurant where Id_resto_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
           ps.executeUpdate();
            System.out.println("Restaurant supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    public void updateRestaurant(Restaurant R){
        String requete = "update restaurant set nom=? ,adresse=? ,theme=? ,specialite=? ,tel=? ,budget=? ,alcool=? ,id_menu_fk=?  where Id_resto_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, R.getNom());
            ps.setString(2, R.getAdresse());
            ps.setString(3, R.getTheme());
            ps.setString(4, R.getSpecialite());
            ps.setInt(5, R.getTel());
            ps.setInt(6, R.getBudget());
            ps.setString(7, R.getAlcool());
            ps.setInt(8, R.getId_menu_fk());
            ps.setInt(9, R.getId_resto_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
    
    public List<Restaurant> DisplayAllResto (){
    List<Restaurant> listeResto = new ArrayList<Restaurant>();

        String requete = "select * from restaurant";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            Restaurant R =new Restaurant();
            while(resultat.next()){
                
                R.setId_resto_pk(resultat.getInt(1));
                R.setNom(resultat.getString(2));
                R.setAdresse(resultat.getString(3));
                R.setTheme(resultat.getString(4));
                R.setSpecialite(resultat.getString(5));
                R.setTel(resultat.getInt(6));
                R.setBudget(resultat.getInt(7));
                R.setAlcool(resultat.getString(8));
                R.setId_menu_fk(resultat.getInt(9));
                listeResto.add(R);
            }
            return listeResto;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
}