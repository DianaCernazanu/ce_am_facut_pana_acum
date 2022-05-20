public class proiect_SEF {
    public static void main(String[] args){
        System.out.println("HELLO ") ;

        Patient patient1 = new Patient("ana" , "parola123") ;

        patient1.addConsultation("doctor1"  , "consultatie" , 1 , 3 , 2001);

        System.out.println(patient1.getName()) ;

        Calendar test = new Calendar() ;

        test.print();
    }
}
