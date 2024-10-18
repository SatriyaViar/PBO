package Jobsheet4.Tugasjs4;
import java.util.ArrayList;
/**
 * Student
 */
public class Student {

    private String studentName;
    private String studentCourse;
    private ArrayList<ModulPraktek> modulPrakteks;

    public String getStutdentCourse(){
        return studentCourse;
    }
    public String getStudentName(){
        return studentName;
    }

    public void setStudentCourse(String studentCourse){
        this.studentCourse = studentCourse;
    }
    
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public Student(String studentName, String studentCourse){
        this.studentName = studentName;
        this.studentCourse = studentCourse;
        this.modulPrakteks = new ArrayList<ModulPraktek>();
    }

    public  void addModulPraktek(ModulPraktek modulPraktek){
        modulPrakteks.add(modulPraktek);
    }
    
    public String getValidasiLisensi(){
        String info = "";
        info += "Student Course: " + this.studentCourse + "\n";
        info += "Student Name: " + this.studentName + "\n";
        if (!modulPrakteks.isEmpty()) {
            info += "Riwayat Student: \n";
             
            boolean syaratLisensi = true;

            for (ModulPraktek modulPraktek : modulPrakteks) {
                info += modulPraktek.getInfoInstructorMobil();

                if (modulPraktek.getNilaiStudent() <= 80) {
                    syaratLisensi = false;
                }
            }
            
            if (syaratLisensi) {
                info += "Student memenuhi syarat untuk mendapatkan lisensi";
            } else {
                info += "Student TIDAK memenuhi syarat untuk mendapatkan lisensi";
            }
        } else {
            info += "Tidak Diketahui";
        } 
        
        info += "\n";
        return info;
    }

    
}   