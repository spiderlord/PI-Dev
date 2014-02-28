/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.entities;

/**
 *
 * @author Boss
 */
public class Menu {

    private int id_menu_pk;
    private int id_resto_fk;
    
    
    public int getid_resto_fk(){
        return id_resto_fk;
    }
    
    public void setid_resto_fk(int id_resto_fk){
        this.id_resto_fk=id_resto_fk;
    }

    /**
     * @return the id_menu_pk
     */
    public int getId_menu_pk() {
        return id_menu_pk;
    }

    public void setId_menu_pk(int id_menu_pk) {
        this.id_menu_pk = id_menu_pk;
    }
    
    
}
