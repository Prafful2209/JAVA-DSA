public class throwskeyword {
    static  void except(int age) throws ArithmeticException {
        if (age>18){
            System.out.println("fine");
        }
        else {
            System.out.println("not fine");
        }
    }
    public static void main(String[] args) {
        except(111);
    }
}