/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Doct
 */
public class Citoyen extends Personne {
    
        private String securite;
     private String question;

    public Citoyen(String securite, String question, String login, String pwd, int cin, String nom, String prenom, int age, String email, int telephone, int verification) {
        super(login, pwd, cin, nom, prenom, age, email, telephone, verification);
        this.securite = securite;
        this.question = question;
    }

    public Citoyen() {
    }

     

   
     
   public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
public String getSecurite() {
        return securite;
    }

    public void setSecurite(String securite) {
        this.securite = securite;
    }
}
