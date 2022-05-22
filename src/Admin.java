import java.util.ArrayList;

public class Admin {
    private String password ;
    private ArrayList<Doctor> doctors ;
    private int number_of_working_doctors = 0 ;

    public Admin(){
        password = "parola" ;
        doctors = new ArrayList<Doctor>() ;
    }



    public void listOfDoctors(){
        for(int i=0 ; i<number_of_working_doctors ; i++){
            System.out.println(doctors.get(i).getName()+" "+doctors.get(i).getField_of_medicine()) ;
        }
    }

    public void deleteDoctor(String name , String field_of_medicine){
        for(int i=0 ; i<number_of_working_doctors ; i++){
            if(doctors.get(i).getName().equals(name)){
                if(doctors.get(i).getField_of_medicine().equals(field_of_medicine)){
                    doctors.remove(i) ;
                    number_of_working_doctors-- ;
                }
            }
        }
    }



}
