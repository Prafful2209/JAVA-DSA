public class exception {
    public static void main(String[] args) {
        int a,b,c=0;
        a=10;
        b=0;
        try {
            c=a/b;
            System.out.println();
        }
        catch (Exception e){
            System.out.println("the error is "+e);
            e.printStackTrace();
        }
    }
}
