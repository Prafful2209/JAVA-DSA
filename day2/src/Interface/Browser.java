package Interface;

interface Browser1{
    void browser1();
}
interface Browser2{
    void browser2();
}
interface Browser3{
    void browser3();
}
public class Browser implements Browser1,Browser2,Browser3{
    public void browser1(){
        System.out.println("google");
    }
    public void browser2(){
        System.out.println("brave");
    }
    public void browser3(){
        System.out.println("edge");
    }

    public static void main(String[] args) {
        Browser b = new Browser();
        b.browser1();
        b.browser2();
        b.browser3();
    }
}
