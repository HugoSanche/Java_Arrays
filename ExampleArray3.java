import java.util.Arrays;
import java.util.Random;
public class ExampleArray3 {
    //Working with binarySearch and equal

    public static void main(String[] Args){
    
        String[] names ={"Sofia","Hugo","Pedro","Veronica", "Diana","Keira"};
        
        //its need to use Arrays.sort to use Arrays.binarySearch
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //if the value found return the position of the name in the array
        //in this case 4
        if (Arrays.binarySearch(names, "Sofia")>=0){
            System.out.println("Found Sofia in the Array "+Arrays.binarySearch(names, "Sofia"));
        }

        System.out.println("**************************");

        //Working with equals
        
        int[] numbers={1,2,3,4,5};
        //int[] numbers2={1,2,3,4,5};
        //int[] numbers2={5,2,3,4,1};
        int[] numbers2={1,2,3,4,5,0};
        if(Arrays.equals(numbers,numbers2 )){
            System.out.println("Arrays are equal");
        }
         else{
            System.out.println("Array are not equal");
         }   
    }

    public static  int[] getRandomArray(int len){
        Random randomNumber= new Random();
        int[] array=new int[len];
        for (int i=0; i<array.length; i++){
            array[i]= randomNumber.nextInt(101);    
        }
        return array;
    }
}
