public class zigzag {
    public static void main(String[] args) {
        for(int i=1;i<4;i++){
            for(int j=1;j<10;j++){
                if(i==1&&j%4==3||i==2&&j%2==0||i==3&&j%4==1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();    
        }
        
    }
}
