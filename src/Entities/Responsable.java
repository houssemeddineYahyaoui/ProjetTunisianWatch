/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author A500
 */
public class Responsable extends Personne {
   private  String domaineTravail;
   private  String adresse;
   private  String grade;
   
   
 public Responsable(String domaineTravail, String adresse, String grade, String login, String passe, String email, String question, String pwd, int cin, String nom, String prenom, int age, int telephone) {
super(login, pwd, question, email, pwd, cin, nom, prenom, age, telephone);
     this.domaineTravail = domaineTravail;
        this.adresse = adresse;
        this.grade = grade;
    }

    public String getDomaineTravail() {
        return domaineTravail;
    }

    public void setDomaineTravail(String domaineTravail) {
        this.domaineTravail = domaineTravail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "responsable{" + "domaineTravail=" + domaineTravail + ", adresse=" + adresse + ", grade=" + grade + '}';
    }

 
    
}
