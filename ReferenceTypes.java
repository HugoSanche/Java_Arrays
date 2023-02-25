import java.util.Arrays;

public class ReferenceTypes {
    public static void main(String[] Args){

        //Value types.- is primitive data types
        //Reference types .- String, Arrays, other objects
        int[] firstArray=new int[5];
        int[] secondArray=firstArray; //first and second have the same reference

        secondArray[0]=1;

        //check first and second array are equals
        //Reference types
        System.out.println("First Array "+Arrays.toString(firstArray));
        System.out.println("Second Array "+Arrays.toString(secondArray));

        System.out.println("**********************************");

        //we created 3 arrays with the same reference
        //if you change the value of one you change three array 
        challenge(firstArray);
        System.out.println("First Array "+Arrays.toString(firstArray));
        System.out.println("Second Array "+Arrays.toString(secondArray));

    }
    public static void challenge(int[] array){
        array[1]=2;
    }
}
