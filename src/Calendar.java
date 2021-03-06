import java.util.ArrayList;

public class Calendar {
    private static ArrayList<Month> months ;

    public Calendar(){
        months = new ArrayList<Month>() ;

        for(int i=1 ; i<=12 ; i++){
            if((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12)){
                Month temp = new Month(31) ;
                months.add(temp) ;
            }else{
                if(i==2){
                    Month temp = new Month(28) ;
                    months.add(temp) ;
                }else{
                    Month temp = new Month(30) ;
                    months.add(temp) ;
                }
            }
        }
    }

    /*public void print(){
        for(int i=0 ;i<12 ; i++){
            System.out.println(months.get(i).getNumber_of_days()) ;
        }
    }*/

    public void setSchedule(ArrayList<Doctor> doctors){
        for(int i=0 ; i<12 ; i++){
            months.get(i).setSchedule(doctors);
        }
    }

    public void printCalendar(){
        for(int i=0 ; i<12 ; i++){
            System.out.println("Month: "+i) ;
            months.get(i).printMonth();
            System.out.println() ;
        }
    }

    public Month getMonth(int month_number){
        return months.get(month_number) ;
    }

}
