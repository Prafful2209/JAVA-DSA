import java.io.File;
import java.io.IOException;

public class file_creation {
    public static void main(String[] args) throws IOException {
        File file =  new File("D:\\day3\\new_folder1\\hii.txt");
        if(file.createNewFile()){
            System.out.println("file "+ file.getName()+"created");
        }
        else{
            System.out.println("file already existing");
        }
    }
}
