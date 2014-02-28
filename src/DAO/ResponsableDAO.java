/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Categorie;
import Entities.Domaine;
import Entities.Responsable;
import Util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A500
 */
public class ResponsableDAO {
    
//--------------------------insertion---------------------------------
    
    public void insertResponsable(Responsable R){
     
   
        String requete = "insert into responsable (CIN,Pwd,Nom,Prenom,EMail,Telephone,DateNaissance,Grade,Categorie,Domaine,Adresse,confirmation) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, R.getCin());
            ps.setString(2, R.getPwd());
   
            ps.setString(3, R.getNom());
            ps.setString(4, R.getPrenom());
            ps.setString(5, R.getEmail());
            ps.setInt(6, R.getTelephone());
            ps.setString(7, R.getDateNaissance());
            ps.setString(8, R.getGrade());
            ps.setString(9, R.getCategorie().toString());
            ps.setString(10,R.getDomaineTravail().toString());
            ps.setString(11,R.getAdresse());
            ps.setInt(12,R.getConfirmation());
                    
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
//-------------------------update-----------------      
    public void updateDateNaissanceResponsable(Responsable R,String ch){
        String requete = "update responsable set DateNaissance=? where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ch);

            ps.setInt(2, R.getCin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
    public void updateDomaineTravailResponsable(Responsable R,String ch){
        String requete = "update responsable set Domaine=? where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ch);

            ps.setInt(2, R.getCin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
    public void updateCategorieResponsable(Responsable R,String ch){
        String requete = "update responsable set Categorie=? where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ch);

            ps.setInt(2, R.getCin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
       
    public void updateTelephoneResponsable(Responsable R,int ch){
        String requete = "update responsable set Telephone=? where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, ch);

            ps.setInt(2, R.getCin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
    public void updateGradeResponsable(Responsable R,String ch){
        String requete = "update responsable set Grade=? where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ch);

            ps.setInt(2, R.getCin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
    public void updatePwdResponsable(Responsable R,String ch){
        String requete = "update responsable set Pwd=? where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ch);

            ps.setInt(2, R.getCin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
    public void updateEmailResponsable(Responsable R,String ch){
        String requete = "update responsable set EMail=? where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ch);

            ps.setInt(2, R.getCin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
    public void updatePrenomResponsable(Responsable R,String ch){
        String requete = "update responsable set Prenom=? where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ch);

            ps.setInt(2, R.getCin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void updateNomResponsable(Responsable R,String ch){
        String requete = "update responsable set Nom=? where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ch);

            ps.setInt(2, R.getCin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
      
    public void updateAdressseResponsable(Responsable R,String ch){
        String requete = "update responsable set Adresse=? where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ch);

            ps.setInt(2, R.getCin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
   
//-------------------------------affichage---------------------------------------
    public Responsable findResponsableById(int id){
       Responsable resp = new Responsable();
     String requete = "select * from responsable where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                resp.setCin(resultat.getInt(1));
                resp.setPwd(resultat.getString(2));
                resp.setEmail(resultat.getString(5));
                resp.setNom(resultat.getString(3));
                resp.setPrenom(resultat.getString(4));
                resp.setGrade(resultat.getString(8));
                resp.setAdresse(resultat.getString(11));
                resp.setDateNaissance(resultat.getString(7));
                resp.setTelephone(resultat.getInt(6));
                if(resultat.getString(9).equals("Prive")){resp.setCategorie(Categorie.prive);}
                if(resultat.getString(9).equals("Etatique")){resp.setCategorie(Categorie.etatique);}
                if(resultat.getString(9).equals("semiEtatique")){resp.setCategorie(Categorie.semiEtatique);}
                
                if(resultat.getString(10).equals("Sante")){resp.setDomaineTravail(Domaine.santé);}
                if(resultat.getString(10).equals("Education")){resp.setDomaineTravail(Domaine.education);}
                 if(resultat.getString(10).equals("Logement")){resp.setDomaineTravail(Domaine.logement);}
                  if(resultat.getString(10).equals("Transport")){resp.setDomaineTravail(Domaine.transport);}
                   if(resultat.getString(10).equals("Commerce")){resp.setDomaineTravail(Domaine.commerce);}
                    if(resultat.getString(10).equals("Indestrie")){resp.setDomaineTravail(Domaine.industrie);}
                     if(resultat.getString(10).equals("Agriculture")){resp.setDomaineTravail(Domaine.agriculture);}
                      if(resultat.getString(10).equals("Autre")){resp.setDomaineTravail(Domaine.autre);}
              
            }
            return resp;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
    
//-------------------------------delete-------------------
      public void deleteResponsable(int cin){
        String requete = "delete from responsable where CIN=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, cin);
            ps.executeUpdate();
            System.out.println("membre supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
}
