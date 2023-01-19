package ecole.gestionecole.model;

public class Exam {
    private String field;
    private String date;
    private String time;
    private String salle;
    private String responsible;
    private String module;
    private String grade;

    public Exam(String module, String field, String grade, String date, String time, String salle, String responsible){
        this.module= module;
        this.field= field;
        this.grade= grade;
        this.date= date;
        this.time= time;
        this.salle= salle;
        this.responsible= responsible;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
