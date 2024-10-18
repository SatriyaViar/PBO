package Jobsheet4.Tugasjs4;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 * KursusMengemudi
 */
public class KursusMengemudi {

    private String courseName;
    private LocalDate tanggalCourse;
    private String instructorName;
    private double priceModul;
    private ArrayList<Student>StudentList;

    public KursusMengemudi(String courseName, String instuctorName, double priceModul){
        this.courseName = courseName;
        this.priceModul = priceModul;
        this.instructorName = instuctorName;
        this.StudentList = new ArrayList<>();
    }

    public void setPricePraktek(double priceModul){
        this.priceModul = priceModul;
    }

    public void setLisenseValid(String praktekModul){
        System.out.println("Modul untuk " + praktekModul);
    }

    public setJadwalInstructure(String instructorName, LocalDate tanggalCourse){
        this.instructorName = instructorName; System.out.println("Jadwal kursus instruktur " + instructorName );
    }

    
}