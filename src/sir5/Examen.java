/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sir5;

import java.util.Calendar;

/**
 *
 * @author agnesvolant
 */
public class Examen {
    public enum TypeExamen{
        RADIOLOGIE_EPAULE, 
        RADIOLOGIE_HANCHE, 
        RADIOLOGIE_BASSIN, 
        RADIOLOGIE_GENOU, 
        RADIOLOGIE_PIED,
        RADIOLOGIE_MAIN,
        RADIOLOGIE_COLONNE,
        RADIOLOGIE_TETE,
        RADIOLOGIE_MEMBRE_SUP, 
        RADIOLOGIE_MEMBRE_INF, 
        RADIOLOGIE_THORAX;
    }

    //Images est en commentaire car il faut soit créer une classe soit utiliser le type image dispo sur Java (ce qui semble être adapté au premier abord).
    //Il faudra qu'on en discute :)
    private Patient patient;
    private String idExam;
    private Professionnel professionnel;
    private String cr;
    //private List <Image> images;
    private Calendar date;
    private TypeExamen type;

    public Examen(Patient patient, String idExam, Professionnel professionnel, String cr, Calendar date, TypeExamen type) {
        this.patient = patient;
        this.idExam = idExam;
        this.professionnel = professionnel;
        this.cr = cr;
        //this.images = images;
        this.date = date;
        this.type = type;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getIdExam() {
        return idExam;
    }

    public void setIdExam(String idExam) {
        this.idExam = idExam;
    }

    public Professionnel getProfessionnel() {
        return professionnel;
    }

    public void setProfessionnel(Professionnel professionnel) {
        this.professionnel = professionnel;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public TypeExamen getType() {
        return type;
    }

    public void setType(TypeExamen type) {
        this.type = type;
    }
       
}