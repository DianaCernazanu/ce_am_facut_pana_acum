import java.util.ArrayList;

public class Month {
    private int number_of_days ;
    private ArrayList<Day> days ;

    public Month(int new_number_of_days){
        number_of_days = new_number_of_days ;
        days = new ArrayList<Day>() ;
    }

    public void add_day(Day new_day){
        days.add(new_day) ;
    }

    public ArrayList<Day> getDays(){
        return days ;
    }

    public int getNumber_of_days(){
        return number_of_days ;
    }

}
