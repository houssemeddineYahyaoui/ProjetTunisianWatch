/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Citoyen;
import Util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Doct
 */
public class DAO {
  public boolean test(String a)
        {    
       
        return  findBylogin(a);
        
        }
  public  boolean testMail(String a,int b)
        {    
        Citoyen ok;
        ok= findByMail(a,b);
        if(a.equals(ok.getEmail()))
           return true;
        return false;
        }
  public  String test(String a,int b)
        {    
        Citoyen ok;
        ok= findByMail(a,b);
        if(a.equals(ok.getEmail()))
           return(ok.getQuestion());
        return null;
        }
   public boolean test(String a,String b,int c)
        {    
        Citoyen ok;
        ok= findByData(a,b,c);
        if(c==1 & ok.getVerification()==0){ JOptionPane.showMessageDialog(null, "Compte veroulle ou en cours de validation");  }
          return a.equals(ok.getLogin())&& b.equals(ok.getPwd()) && ok.getVerification()==1;       
        }
    public List<String> DisplayAllDepots (){
        List<String> listedepots = new ArrayList<String>();
        String requete = "select type_question  from quest";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
 try {
            while(resultat.next())
            {
                listedepots.add(resultat.getString(1));
            }
            } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement  "+ex.getMessage());
            return null;
        }
            return listedepots;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement   "+ex.getMessage());
            return null;
        }
    }
    public List<String> AllCategorie (){
        List<String> listedepots = new ArrayList<String>();
        String requete = "select categ  from categorie";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
        try {
            while(resultat.next())
            {
                listedepots.add(resultat.getString(1));
            }
            } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement  "+ex.getMessage());
            return null;
        }
            return listedepots;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement   "+ex.getMessage());
            return null;
        }
    }
    public List<String> AllDomaine (){
        List<String> listedepots = new ArrayList<String>();
        String requete = "select dom  from domaine";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
        try {
            while(resultat.next())
            {
                listedepots.add(resultat.getString(1));
            }
            } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement  "+ex.getMessage());
            return null;
        }
            return listedepots;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement   "+ex.getMessage());
            return null;
        }
    }
      public void insert(String pseudo,String nom,String prenom,String mail,String mdp,int tel,int cin,int age,String questsecutite,String type  ){

        String requete = "insert into citoyens values (?,?,?,?,?,?,?,?,?,?,0)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, pseudo);
            ps.setString(2, questsecutite);
            ps.setString(3, mdp);
            ps.setInt(4,cin );
            ps.setString(5, nom);
             ps.setString(6, prenom);
            ps.setInt(7, age);
            ps.setString(8, mail);
            ps.setInt(9, tel);
            ps.setString(10, type);

            ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, "erreur lors de l'insertion "+ex.getMessage());
        }
    }
     public Citoyen findByData(String login,String pwd,int a){
     Citoyen p = new Citoyen();
     PreparedStatement ps;
     String requete="";
     if(a==1){ requete = "select login,pwd,verification from citoyens where login=?  and pwd=? ";}
     if(a==2){ requete = "select login,pwd,verification from responsable_etablisement where login=?  and pwd=? ";}
     if(a==3){ requete = "select login,pwd,verification from admin where login=?  and pwd=? ";}
     
        try {
            try {
              ps = MyConnection.getInstance().prepareStatement(requete);
            } catch (Exception ex) {
            System.out.println("erreur lors ");
            return null;
        }
            ps.setString(1, login);
            ps.setString(2, pwd);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                p.setLogin(resultat.getString(1));
                p.setPwd(resultat.getString(2));
                p.setVerification(resultat.getInt(3));
            }
            return p;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
     
  public Citoyen findByMail(String email,int a){
     Citoyen p = new Citoyen();
     PreparedStatement ps;
     String  requete = "";
  
     if(a==1){ requete = "select email,login,type_question from citoyens where email=? ";}
     if(a==2){ requete = "select email from responsable_etablisement where email=? ";}
         try {
            try {
              ps = MyConnection.getInstance().prepareStatement(requete);
            } catch (Exception ex) {
            System.out.println("erreur lors ");
            return null;
        }
            ps.setString(1, email);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                p.setEmail(resultat.getString(1));
                p.setLogin(resultat.getString(2));
                p.setQuestion(resultat.getString(3));
                
                
            }
 
            return p;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
   public Citoyen finduser(String login,String pwd){
     Citoyen p = new Citoyen();
     PreparedStatement ps;
     String 
     requete = "select * from citoyens where login=?  and pwd=? ";
 
     
        try {
            try {
              ps = MyConnection.getInstance().prepareStatement(requete);
            } catch (Exception ex) {
            System.out.println("erreur lors ");
            return null;
        }
            ps.setString(1, login);
            ps.setString(2, pwd);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                 
                p.setLogin(resultat.getString(1));
                p.setSecurite(resultat.getString(2));
                p.setPwd(resultat.getString(3));
                p.setCin(resultat.getInt(4));
                p.setNom(resultat.getString(5));
                p.setPrenom(resultat.getString(6));
                p.setAge(resultat.getInt(7));
                p.setEmail(resultat.getString(8));
                p.setTelephone(resultat.getInt(9));
                p.setQuestion(resultat.getString(10));
            }
            return p;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
   public ResultSet findData(int cin){
      PreparedStatement ps;
     String 
     requete = "select Type,Domaine,Categories,etat_Rec from reclamation where Cin_citoyen=? ";
 
     
        try {
            try {
              ps = MyConnection.getInstance().prepareStatement(requete);
            } catch (Exception ex) {
            System.out.println("erreur lors ");
            return null;
        }
            ps.setInt(1, cin);
            
            ResultSet resultat = ps.executeQuery();
           
            return resultat;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
  public boolean findByCode(String login,String ch){
      String   requete = "select *  from citoyens where  email=? and securite=? ";
         try 
         {
            PreparedStatement   ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,login);
            ps.setString(2,ch);
             ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {return true;}
            return false;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return false;
        }
    } public boolean findBylogin(String login){
      String   requete = "select *  from citoyens where login=? ";
         try 
         {
            PreparedStatement   ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,login);            
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {return true;}
            return false;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return false;
        }
    }
 public boolean updateMdp(String  ch,String a){
        String requete = "update citoyens set pwd=? where securite=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, a);
            ps.setString(2,ch);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            return true;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return false;
        }
     }
 public boolean desactive(int a){
        String requete = "update citoyens set verification=0 where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, a);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            return true;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return false;
        }
     }
 public boolean updateData(String login, String securite, String email, String question, String pwd, int cin, String nom, String prenom, int age, int telephone,int b){
        String requete = "update citoyens set login=? , securite=? , pwd=? , CIN=? , Nom=? ,  prenom=?"
                + ", age=? , email=? , telephone=?  where CIN=? ";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ps.setString(2,securite);
            ps.setString(3, pwd);
            ps.setInt(4,cin);
            ps.setString(5, nom);
            ps.setString(6,prenom);
            ps.setInt(7, age);
            ps.setString(8, email);
            ps.setInt(9,telephone);
            ps.setInt(10,b);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            return true;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return false;
        }
     }

  public  boolean insertReclamation(String suj, String categorie, String domaine, String Etat, int cin) {
        String requete = "insert into reclamation(Type,Domaine,Categories,etat_Rec,Cin_citoyen) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, suj);
            ps.setString(2, domaine);
            ps.setString(3, categorie);
            ps.setString(4, Etat);
            ps.setInt(5,cin );
            ps.executeUpdate();
               return true;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, "erreur lors de l'insertion "+ex.getMessage());
        }
        return false;
     }
 
    
}
