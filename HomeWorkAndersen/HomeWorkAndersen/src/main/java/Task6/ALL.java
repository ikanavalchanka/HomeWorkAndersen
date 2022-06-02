package Task6;

public class ALL {
    public static void main(String[]args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange \n Banana \n Apple \n");
    }
    public static void checkSumSign(){
        int a=-10, b=10;
        if(a+b>=0){
            System.out.println("SUMMA POLOZITELNAYA");
        }
        if( a+b<0);
        System.out.println("SUMMA OTRITSATELNAYA");
    }
    public static void printColor(){
        int a=66;
        if (a<=0){
            System.out.println("RED");
        }
        if (a>0 && a<=100){
            System.out.println("YELLOW");
        }
        if (a>100 && a!=100){
            System.out.println("GREEN");
        }
    }
    public static void compareNumbers(){
        int a=107, b=77;
        if (a>=b){
            System.out.println("a>=b");}
        else if (a<b){
            System.out.println(a<b);
        }
    }
}

