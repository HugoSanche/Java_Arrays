
import java.util.Arrays;

public class Reverse {
    public static void main(String[] Args){ 
        int[] myArray={5,4,3,2,1};
        System.out.println(Arrays.toString(myArray));
        int[] reverseArray=reverse2(myArray);
        System.out.println(Arrays.toString(reverseArray));
    }
    //first way
    public static int[] reverse(int[] array){
        int[] reverseArray= new int[array.length];
       int x=0;
        for (int i=array.length-1;i>=0; i--){
                reverseArray[x]=array[i];
                x+=1;
        }
        return reverseArray;
    }
    //second way reverced (this is more efficient)
    public static int[] reverse2(int[] array){
        int max=array.length-1;
        int medium=array.length/2;
        //{5,4,3,2,1}
        for (int i=0;i<medium; i++){
                int temp=array[i];
                array[i]=array[max-i];
                array[max-i]=temp;
                
        }
        return array;
    }
}
