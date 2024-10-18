package Jobsheet4.Tugasjs4;
import java.time.LocalDate;
/**
 * ModulPraktek
 */
public class ModulPraktek {

    private LocalDate tanggalInstructorDate;
    private Pegawai InstructorMobil;
    private int nilaiStudent;

    public ModulPraktek(LocalDate tanggalInstructorDate, Pegawai InstructorMobil, int nilaiStudent){
        this.tanggalInstructorDate = tanggalInstructorDate;
        this.InstructorMobil = InstructorMobil;
        this.nilaiStudent = nilaiStudent;
    }
    public LocalDate getTanggal(){
        return tanggalInstructorDate;
    }

    public void setTanggal(LocalDate localDate){
        this.tanggalInstructorDate = localDate;
    }

    public Pegawai getInstructorMobil(){
        return InstructorMobil;
    }

    public int getNilaiStudent(){
        return nilaiStudent;
    }

    public void setNilaiStudent(int nilaiStudent){
        this.nilaiStudent = nilaiStudent;
    }
    
    public String getInfoInstructorMobil(){
        String info = "";
        info += "\t Tanggal Praktek : " + tanggalInstructorDate;
        info += "\t InstructorMobil: " + InstructorMobil.getInfo();
        info += "\t Nilai Student: " + nilaiStudent;
        info += "\n";

        return info;
    }
    
    
}