import java.lang.reflect.Array;
import java.util.ArrayList;

public class Day {
    private ArrayList<Doctor> working_doctors ;
    private ArrayList<Hour> hours ;
    private Month month ;

    public Day(Month month){
        this.month = month ;
        working_doctors = new ArrayList<Doctor>() ;
        hours = new ArrayList<Hour>() ;

        for(int i=0 ; i<8 ; i++){
            Hour temp = new Hour(this);
            hours.add(temp) ;
        }
    }

    public void add_working_doctor(Doctor new_doctor){
        //Doctor temp ;
        int fail = 0 ;
        //temp = new Doctor(new_name , new_field_of_medicine) ;

        for(int i=0 ; i<working_doctors.size() ; i++){
            if(working_doctors.get(i).equals(new_doctor)){
                fail = 1 ;
            }
        }

        if(fail==0){
            working_doctors.add(new_doctor) ;
           /* for(int i=0 ; i<8 ; i++){
                hours.get(i).setHour(working_doctors);
            }*/
        }


    }

    /*public void setHours(){
        for(int i=0 ; i<8 ; i++){
            hours.get(i).setHour(working_doctors);
        }
    }*/

    public void makeAppointment(Doctor doctor , Patient patient ,int hour_of_appointment){
        //Doctor temp = new Doctor(name , field_of_medicine) ;

        /*for(int i=0 ; i<working_doctors.size() ; i++){
            if(working_doctors.get(i).equals(temp)){
                hours.get(hour_of_appointment).busyDoctor(working_doctors.get(i));
            }
        }*/

        Appointment new_appointment = new Appointment(patient , doctor , hours.get(hour_of_appointment)) ;

        hours.get(hour_of_appointment).addAppointment(new_appointment);
    }

    public void print(){
        for(int i = 0 ; i<8 ; i++){
            System.out.println("hour: "+(i));

            hours.get(i).print_hour() ;
            System.out.println() ;

        }
    }

    /*public void addAllDoctors(ArrayList<Doctor> doctors){
        for(int i=0 ; i< doctors.size() ; i++){
            working_doctors.add(doctors.get(i)) ;
        }
    }*/

    public ArrayList<Doctor> getWorkingDoctors(){
        return working_doctors ;
    }

    public Hour getHour(int hour_number){
        return hours.get(hour_number) ;
    }



}
