import java.util.ArrayList;

public class Patient {
    private String name ;
    private String password ;
    private ArrayList <Consultation> consultations ;

    public Patient(String new_name , String new_password){
        name = new_name ;
        password = new_password ;
        consultations = new ArrayList<Consultation>() ;
    }

    public void addConsultation(String doctor_name , String procedure , int date_day , int date_month , int date_year){
        Consultation temp = new Consultation(name , doctor_name , procedure , date_day , date_month , date_year) ;
        consultations.add(temp) ;
    }

    public String getName(){
        return name ;
    }

    public String getPassword(){
        return password ;
    }

    public ArrayList <Consultation> getConsultations(){
        return consultations ;
    }
}
