import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
         int age=20;
         int physics=94;
         int chemistry=98;
         int BIO=93;
         int[] marks=new int[3];
         marks[0]=94;
         marks[1]=98;
         marks[2]=93;
        //System.out.println(marks.length);
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
