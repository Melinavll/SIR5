/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sir5;

/**
 *
 * @author agnesvolant
 */
public class Patient {

    private int idPatient;
    private String nomDeNaissance;
    private String prenom;
    private Date dateDeNaissance;
    private String adresse;
    private String sexe;

    public Patient(int idPatient, String nomDeNaissance, String prenom, Date dateNaissance, String sexe, String adresse) {
        this.idPatient = idPatient;
        this.nomDeNaissance = nomDeNaissance;
        this.prenom = prenom;
        this.dateDeNaissance = dateNaissance;
        this.sexe = sexe;
        this.adresse = adresse;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public String getNomDeNaissance() {
        return nomDeNaissance;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String adresse() {
        return adresse;
    }

}
