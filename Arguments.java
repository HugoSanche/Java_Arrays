import java.lang.reflect.Array;
import java.util.Arrays;

public class Arguments{
    public static void main(String[] Args){
        System.out.println("Hi every one");

        String[] args="Hi every one again".split(" ");
        printText(args); 
        //printText("Hello");//compile error
        printText2("Hello");

        System.out.println("*".repeat(20));
        printText2();

        String[] array={"Pedro","Pablo","Daniel","Janeth","Claudia"};
        
        System.out.println(String.join(",", array));
        System.out.println(Arrays.toString(array));
        
    }
    //only recibe arguments like String[]
    public static void printText(String[] args){
            for (String elements: args){    
                System.out.println(elements);
            }
    }
    //recibe arguments many types
    public static void printText2(String... args){
        for (String elements: args){    
            System.out.println(elements);
        }
}
}