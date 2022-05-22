import java.util.ArrayList;

public class Hour {
    //private ArrayList<Doctor> available_doctors ;
    private ArrayList<Appointment> appointments ;
    private int number_of_doctors ;
    private Day day ;

    public Hour(Day day){
        this.day = day ;
        appointments = new ArrayList<>() ;
        //available_doctors = new ArrayList<Doctor>() ;
    }

    /*public void setHour(ArrayList<Doctor> workingDoctor){
        number_of_doctors = workingDoctor.size() ;

        int fail = 0 ;

        for(int i=0 ; i<number_of_doctors ; i++){
            for(int j=0 ; j<available_doctors.size() ; j++){
                if(available_doctors.get(j).equals(workingDoctor.get(i))){
                    fail = 1 ;
                }
            }
            if(fail == 0){
                available_doctors.add(workingDoctor.get(i))  ;
            }

            fail = 0 ;

        }
    }*/

    /*public void busyDoctor(Doctor doctor){
        for(int i=0 ; i<available_doctors.size() ; i++){
            if(available_doctors.get(i).equals(doctor)){
                available_doctors.remove(i) ;

            }
        }
    }*/

    /*public void print_hour(){
        System.out.println((number_of_doctors)) ;
        for(int i=0 ; i<available_doctors.size() ; i++){
            System.out.println(available_doctors.get(i).getName()) ;
        }
    }*/

    public void print_hour(){
        int busy = 0 ;
        for(int i=0 ; i<day.getWorkingDoctors().size() ; i++){
            for(int j=0 ; j<appointments.size() ; j++){
                if(appointments.get(j).getDoctor().equals(day.getWorkingDoctors().get(i))){
                    busy =1 ;
                }
            }

            if(busy == 0){
                System.out.println(day.getWorkingDoctors().get(i).getName())  ;
            }
            busy = 0 ;
        }
    }

    public void addAppointment(Appointment new_appointment){
        appointments.add(new_appointment) ;
    }

}
