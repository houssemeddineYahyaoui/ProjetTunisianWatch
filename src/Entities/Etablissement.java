/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author A500
 */
public class Etablissement {
    protected String lieu;
    protected int Fax;
    protected String adresse;
    protected Categorie categorie;
    protected Domaine domaine;
    
    ArrayList<Responsable> List = new ArrayList<Responsable>();

    public Etablissement() {
       
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getFax() {
        return Fax;
    }

    public void setFax(int Fax) {
        this.Fax = Fax;
    }



    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }
    
    

 
    
    
    
}
