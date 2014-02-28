/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.entities;

import java.util.Date;

/**
 *
 * @author user
 */
public class Commentaire {
    
    
   private  int id_coms_pk;
   private String texte;
   private int id_resto_fk;
   
   
   
   Date date;
   public Date getDates(){
       return date;
   }
   

   public int getIdcommentaire(){
       return id_coms_pk;
   }
   public void  setDates(Date date){
       this.date=date;
   }
   public void setIdcommentaire(int id_coms_pk ){
         this.id_coms_pk=id_coms_pk;
   }
   

   public String getText(){
       return texte;
   }
   public void setText(String txt){
       texte=txt;
   }

}
