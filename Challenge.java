
import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] Args){
        int[] result=readIntegers();
        System.out.println(Arrays.toString(result));
        System.out.println("The minimun value of the array = "+findMin(result));
    }

    public static int[] readIntegers(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Write integers separated by ,");
        String stringNumbers=scan.nextLine();

        //convert String to String[] using split
        String[]  arrayStringNumbers=stringNumbers.split(",");
        int[] integerNumbers=new int[arrayStringNumbers.length];

        for(int i=0; i<arrayStringNumbers.length;i++){
            //trim if user pit space before ,
            integerNumbers[i]=Integer.parseInt(arrayStringNumbers[i].trim());
        }
        return integerNumbers;
    }
    public static int findMin(int[] array){
        //Arrays.sort(array); //Easy mode
        sortAscendingArray(array); //using my order
        return array[0];

    }
    public static int[] sortAscendingArray(int[] array){
        int temp;
        boolean flag;
        while(true){
            flag=false;
            for (int i=0; i<array.length-1; i++ )
            {
                //{4,3,5}
                if (array[i]>array[i+1]){
                    temp=array[i];
                    array[i] =array[i+1];
                    array[i+1]=temp;
                    flag=true;       
                }
            }
            return array;
        }
        //return array;
    } 
}
