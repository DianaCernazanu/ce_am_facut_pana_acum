import java.util.ArrayList;

public class Doctor {
    private String name ;
    private String field_of_medicine ;
    private ArrayList<Patient> old_patients ;
    private String password ;
    private ArrayList<Integer> working_date ;
    private int[] hours ;
    private Calendar calendar ;

    public Doctor(String new_name , String new_field_of_medicine){
        name = new_name ;
        field_of_medicine = new_field_of_medicine ;
        old_patients = new ArrayList<Patient>() ;
        hours = new int[8] ;
        working_date = new ArrayList<>() ;
    }

    public void setPassword(String new_password){
        password = new_password ;
    }

    public String getName(){
        return name ;
    }

    public String getField_of_medicine(){
        return field_of_medicine ;
    }

    public void addWorkingDay(ArrayList<Integer> new_working_days){

        for(int i=0 ; i< new_working_days.size() ; i++){
            working_date.add(new_working_days.get(i));
        }
    }

    public boolean isWorkingToday(int date){
        for(int i=0 ; i<working_date.size() ; i++){
            if(date == working_date.get(i)){
                return true ;
            }
        }
        return false ;
    }


    public boolean equals(Doctor new_doctor){
        if(new_doctor.getName().equals(this.name)){
            if(new_doctor.getField_of_medicine().equals(this.field_of_medicine)){
                return true ;
            }
        }
        return false ;
    }



}
