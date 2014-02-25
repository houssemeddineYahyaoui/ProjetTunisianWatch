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
    protected int telephone;
    protected String courrierElectronique;
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getCourrierElectronique() {
        return courrierElectronique;
    }

    public void setCourrierElectronique(String courrierElectronique) {
        this.courrierElectronique = courrierElectronique;
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
