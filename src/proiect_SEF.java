import java.util.ArrayList;

public class proiect_SEF {
    public static void main(String[] args){
        Application app = new Application() ;

        app.addDoctor("George" , "oftalmolog" , 5 , new int[]{1, 2, 6, 8, 10});
        app.addDoctor("Maria" , "oftalmolog" , 7 , new int[]{1, 2, 7, 9, 10 , 11 , 13});
        //app.printCalendar();
        app.addPatient("Ionel") ;
        app.makeAppointment("Ionel" , "George" , 1 , 2 , 3);
        app.printCalendar();
    }
}
