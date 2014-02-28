/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;



/**
 *
 * @author A500
 */
public abstract class Personne {
  
    protected String pwd;
    protected int cin;
    protected String nom;
    protected String prenom;
    protected String dateNaissance;
    protected String email;
    protected int telephone;
     
      public Personne() {
    }

    public Personne(String pwd, int cin, String nom, String prenom, String dateNaissance, String email, int telephone) {
        this.pwd = pwd;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Personne{" + "pwd=" + pwd + ", cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", email=" + email + ", telephone=" + telephone + '}';
    }

  

    

  
 
    
   
    
}
