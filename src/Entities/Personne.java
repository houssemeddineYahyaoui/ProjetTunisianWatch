/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author A500
 */
public abstract class Personne {
    protected String login;
    protected String pwd;
    protected int cin;
    protected String nom;
    protected String prenom;
    protected int age;
    protected String email;
    protected int telephone;
     
      public Personne() {
    }
     
     
  public  Personne(String login,String pwd){   
       this.login=login;
       this.pwd=pwd;
   }

    public Personne(String login, String pwd, int cin, String nom, String prenom, int age, String email, int telephone) {
        this.login = login;
        this.pwd = pwd;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        return "Personne{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", email=" + email + ", telephone=" + telephone + '}';
    }
   
    
}
