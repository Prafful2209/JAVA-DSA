package Iheritance;

class SimpleCalculator {
    void addition(int a,int b) {
        System.out.println(a + b);
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void subtraction(int a,int b){
        System.out.println(a-b);
    }
}

class SuperAdvancedCalculator extends AdvancedCalculator{
    void multiplication(int a,int b){
        System.out.println(a*b);
    }
}

public class Calculator{
    public static void main(String[] args){
        SuperAdvancedCalculator s1= new SuperAdvancedCalculator();
        s1.multiplication(4,5);
    }
}
