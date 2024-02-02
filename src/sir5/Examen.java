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
    private String PHrespo;
    private CR cr;
    private List<Image> images;
    private Date date;
    private String type;

    public Examen(String idExam, String PHrespo, Date date, String type) {
        this.idExam = idExam;
        this.PHrespo = PHrespo;
        this.date = date;
        this.type = type;
    }

    public String getIdExam() {
        return idExam;
    }

    public PHrespo PHrespo() {
        return PHrespo
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

}
