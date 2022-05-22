import java.util.ArrayList;

public class Application {
    private ArrayList<Doctor> doctors ;
    private ArrayList<Patient> patients ;
    private Admin admin ;
    private Calendar calendar ;

    public Application(){
        doctors = new ArrayList<>() ;
        patients = new ArrayList<>() ;
        admin = new Admin() ;
        calendar = new Calendar() ;
    }

    public void printCalendar(){
        calendar.printCalendar();
    }

    /*public void setCalendar(){

    }*/

    public void addDoctor(String name , String field_of_medicine , int number_of_working_days, int[] day_number){
        ArrayList<Integer> working_days = new ArrayList<>() ;

        for(int i=0 ;i<number_of_working_days ; i++){
            working_days.add(day_number[i]) ;
        }

        Doctor temp = new Doctor(name , field_of_medicine) ;

        temp.addWorkingDay(working_days);

        doctors.add(temp) ;
        calendar.setSchedule(doctors);
    }

    public void addPatient(String name){
        Patient temp = new Patient(name) ;

        patients.add(temp) ;
    }

    public void makeAppointment(String patient_name , String doctor_name , int month , int day , int hour){
        int patient_index = -1 ;
        int doctor_index = -1 ;

        for(int i = 0 ;i< patients.size() ; i++){
            if(patients.get(i).getName().equals(patient_name)){
                patient_index = i ;
            }
        }

        for(int i = 0 ; i<doctors.size() ; i++){
            if(doctors.get(i).getName().equals(doctor_name)){
                doctor_index = i ;
            }
        }

        if((patient_index!=-1)&&(doctor_index!=-1)){
            Appointment new_appointment = new Appointment(patients.get(patient_index), doctors.get(doctor_index), calendar.getMonth(month).getDay(day).getHour(hour)) ;
            calendar.getMonth(month).getDay(day).getHour(hour).addAppointment(new_appointment);
        }
    }
}
