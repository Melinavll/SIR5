/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sir5;

/**
 *
 * @author evabr
 */
public class Professionnel {
    public enum Profession {
        PH, 
        SECRETAIRE,
        MR;
    }
    
    private String nom;
    private String prenom;
    private String identifiant;
    private String mdp;
    private Profession profession;

    public Professionnel(String nom, String prenom, String identifiant, String mdp, Profession profession) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.mdp = mdp;
        this.profession = profession;
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

    public String getIdentifiant() {
        return identifiant;
    }
    
 public Profession getProfession() {
        return profession;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
     public void setProfession(Profession profession) {
        this.profession = profession;
    }
}
