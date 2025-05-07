import java.io.File;

public class filehandle {
    public static void main(String[] args) {
        File folder =  new File("D:\\day3\\new_folder1");
        if(folder.mkdir()){
            System.out.println("Folder"+ folder.getName()+"created");
        }
        else{
            System.out.println("Folder already existing");
        }
    }
}
