import java.util.ArrayList;

public class Day {
    private ArrayList<Doctor> working_doctors ;

    public Day(){
        working_doctors = new ArrayList<Doctor>() ;
    }

    public void add_working_doctor(String new_name , String new_field_of_medicine){
        Doctor temp ;
        temp = new Doctor(new_name , new_field_of_medicine) ;

        working_doctors.add(temp) ;
    }

    public ArrayList<Doctor> getWorking_doctors(){
        return working_doctors ;
    }

}
