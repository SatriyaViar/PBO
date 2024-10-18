package Jobsheet4.Tugasjs4;

/**
 * Pegawai
 */
public class Pegawai {

    private String instructorName;
    private String instrukturID;

    public Pegawai (String instructorName, String instrukturID){
        this.instructorName = instructorName;
        this.instrukturID = instrukturID;
    }

    public String getinstructurID(){
        return instrukturID;
    }

    public void setInstructorID(String instruckturID){
        this.instrukturID = instruckturID;
    }
    public void setInstructorName(String instructorName){
        this.instructorName = instructorName;
    }

    public String getinstructorName(){
        return instructorName;
    }

    public String getInfo(){
        return instructorName + " ID : " + instrukturID;
    }
}