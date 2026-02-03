public class UserValidator {
    
    public static boolean isValidAge(int age){
        if(age>0 && age < 120){
            return true;
        }
        return false;
    }
    
}
