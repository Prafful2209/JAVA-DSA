public class throweception {
    public static void main(String[] args) {
        int age = 19;
        if (age > 18) {
            System.out.println("Access Granted");
        } else {
            throw new ArithmeticException("rejected");

        }

    }
}