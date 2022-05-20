import java.util.ArrayList;

public class Doctor {
    private String name ;
    private String field_of_medicine ;
    private ArrayList<Patient> old_patients ;

    public Doctor(String new_name , String new_field_of_medicine){
        name = new_name ;
        field_of_medicine = new_field_of_medicine ;
        old_patients = new ArrayList<Patient>() ;
    }

    //public void add_seen_patient(String name)

    public String getName(){
        return name ;
    }

    public String getField_of_medicine(){
        return field_of_medicine ;
    }

}
