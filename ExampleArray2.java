import java.util.Arrays;
import java.util.Random;

public class ExampleArray2 {
    public static void main(String[] Args){
        int[] firstArray=getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray= new int[10];
        System.out.println(Arrays.toString(secondArray));

        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray= getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourArray=Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourArray));

        Arrays.sort(fourArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourArray));

        int[] smallerArray=Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largeArray=Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largeArray));


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
