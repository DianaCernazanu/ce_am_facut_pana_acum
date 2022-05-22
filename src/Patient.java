import java.util.ArrayList;

public class Patient{
    private String name ;
    private String password ;
    private ArrayList <Consultation> consultations ;

    public Patient(String new_name){
        name = new_name ;
        consultations = new ArrayList<Consultation>() ;
    }

    public void setPassword(String new_password){
        password = new_password ;
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

    public boolean equals(Patient new_patient){
        if(new_patient.getName().equals(this.name)){
            return true ;
        }
        return false ;
    }

}
