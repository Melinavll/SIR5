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
public class Examen {

    private Patient patient;
    private String idExam;
    private Professionnel professionnel;
    private String cr;
    private List<Image> images;
    private Date date;
    private String type;

    public Examen(String idExam, String PHrespo, Date date, String type) {
        this.idExam = idExam;
        this.professionnel = professionnel;
        this.date = date;
        this.type = type;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getIdExam() {
        return idExam;
    }

    public Professionnel professionnel () {
        return professionnel;
    }

    public String getCr() {
        return cr;
    }

    public <any> getImages() {
        return images;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setIdExam(String idExam) {
        this.idExam = idExam;
    }

    public void setPHrespo(String PHrespo) {
        this.PHrespo = PHrespo;
    }

    public void setCr(CR cr) {
        this.cr = cr;
    }

    public void setImages(<any>  images) {
        this.images = images;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

}
