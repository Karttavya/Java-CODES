// User Defined Exception Class
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class UserExceptionDemo {

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Not eligible – Age less than 18");
        } else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } 
        catch (AgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
