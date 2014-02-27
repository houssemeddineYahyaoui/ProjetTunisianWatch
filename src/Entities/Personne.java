/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

public class Personne {
    private String login;
    private String pwd;
    private int cin;
    private String nom;
    private String prenom;
    private int age;
    private String email;
    private int telephone;
     private int verification;

    public Personne() {
    }

    public int getVerification() {
        return verification;
    }

    public void setVerification(int verification) {
        this.verification = verification;
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

 
  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Personne(String login, String pwd, int cin, String nom, String prenom, int age, String email, int telephone, int verification) {
        this.login = login;
        this.pwd = pwd;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
        this.verification = verification;
    }

   

    
}
