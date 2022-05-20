public class AppUser {
    private String name ;
    private String password ;

    public AppUser(String new_name , String new_password){
        name = new_name ;
        password = new_password ;
    }

    public String get_name(){
        return name ;
    }

    public String get_password(){
        return password ;
    }
}
