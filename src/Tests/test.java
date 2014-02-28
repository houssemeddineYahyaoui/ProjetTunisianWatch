/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import DAO.ResponsableDAO;
import Entities.Categorie;
import Entities.Domaine;
import Entities.Responsable;
import java.sql.Date;


/**
 *
 * @author A500
 */
public class test {
    public static void main (String [] args){
 
         
  Responsable r= new Responsable(Domaine.commerce, Categorie.etatique, "bargou", "directeur", "0014", 04763, "ali", "benali", "10/12/1980", "ali@gmail.fr", 99441023);
  
  
  
         ResponsableDAO rd= new ResponsableDAO();
         rd.insertResponsable(r);
        
    }
    
}
