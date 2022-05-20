public class Consultation {
    private String patient_name ;
    private String doctor_name ;
    private String procedure ;
    private int date_day , date_month , date_year ;

    public Consultation(String new_patient_name , String new_doctor_name , String new_procedure , int new_date_day , int new_date_month , int new_date_year){
        patient_name = new_patient_name ;
        doctor_name = new_doctor_name ;
        procedure = new_procedure ;
        date_day = new_date_day ;
        date_month = new_date_month ;
        date_year = new_date_year ;
    }

    public String getPatient_name(){
        return patient_name ;
    }

    public String getDoctor_name(){
        return doctor_name ;
    }

    public String getProcedure(){
        return procedure ;
    }

    public int getDate_day(){
        return date_day ;
    }

    public int getDate_month(){
        return date_month ;
    }

    public int getDate_year(){
        return date_year ;
    }

}
