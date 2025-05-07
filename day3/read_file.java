import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class read_file {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\day3\\new_folder1\\hi.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);

        }
        sc.close();
    }
}
