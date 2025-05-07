import java.io.File;
import java.io.IOException;

public class file_deletion {
    public static void main(String[] args) throws IOException {
        File file =  new File("D:\\day3\\new_folder1\\hii.txt");
        if(file.delete()){
            System.out.println("file "+ file.getName()+"deleted");
        }
        else{
            System.out.println("file already existing");
        }
    }
}
