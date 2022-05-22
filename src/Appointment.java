public class Appointment {
    private Patient patient ;
    private Doctor doctor ;
    private Hour hour ;

    public Appointment(Patient patient , Doctor doctor , Hour hour){
        this.patient = patient ;
        this.doctor = doctor ;
        this.hour = hour ;
    }

    public Patient getPatient(){
        return patient ;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Hour getHour() {
        return hour;
    }


}
