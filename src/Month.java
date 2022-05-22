import java.util.ArrayList;

public class Month {
    private int number_of_days ;
    private static ArrayList<Day> days ;

    public Month(int new_number_of_days){
        number_of_days = new_number_of_days ;
        days = new ArrayList<Day>() ;

        for(int i=0 ; i<number_of_days ; i++){
            Day temp = new Day(this) ;

            //temp.setHours();

            days.add(temp) ;


        }
    }

    /*public void add_day(Day new_day){
        days.add(new_day) ;
    }*/

    public ArrayList<Day> getDays(){
        return days ;
    }

    public Day getDay(int day_number){
        return days.get(day_number) ;
    }

    public int getNumber_of_days(){
        return number_of_days ;
    }

    public void setSchedule(ArrayList<Doctor> doctors){
        for(int i=0 ; i<number_of_days ; i++){
            for(int j=0 ; j<doctors.size() ; j++){
                if(doctors.get(j).isWorkingToday(i)){
                    days.get(i).add_working_doctor(doctors.get(j));
                    //days.get(i).setHours();
                }
            }
        }
    }

    public void printMonth(){
        for(int i=0 ; i<number_of_days ; i++){
            System.out.println("Day: "+i) ;
            days.get(i).print();

        }
    }

    public void makeAppointment(Doctor doctor , Patient patient , int day_number ,int hour){
        //Day temp ;
        //temp = days.get(day) ;

        days.get(day_number).makeAppointment(doctor , patient , hour);
    }

}
