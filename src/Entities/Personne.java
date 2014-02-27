/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

public class Personne {
    private String login;
    private String securite;
    private String pwd;
    private int cin;
    private String nom;
    private String prenom;
    private int age;
    private String email;
    private int telephone;
     private String question;
     private int verification;

    public int getVerification() {
        return verification;
    }

    public void setVerification(int verification) {
        this.verification = verification;
    }
    public String getPwd() {
        return pwd;
    }
public String getSecurite() {
        return securite;
    }

    public void setSecurite(String securite) {
        this.securite = securite;
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

 
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
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

   

    @Override
    public String toString() {
        return "Personne{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", email=" + email + ", telephone=" + telephone + '}';
    }
    
}
