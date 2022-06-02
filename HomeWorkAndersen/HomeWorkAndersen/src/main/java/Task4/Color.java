package Task4;

public class Color {
    public static void main(String[] args){
        printColor();
    }
    public static void printColor(){
        int a=66;
        if (a<=0){
            System.out.println("Red");}
            if  (a>0 && a<=100){
                System.out.println("Yellow");
            }
            if (a>100 && a!=100){
                System.out.println("Green");
            }
        }
    }
