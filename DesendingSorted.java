import java.util.Arrays;
import java.util.Random;

public class DesendingSorted {
    public static void main(String[] Args){
        int[] numbers;
        numbers=getRandomNumber(10);
        
        System.out.println(Arrays.toString(numbers));

        //int [] numbersDecending=orderDecendingArrayNumbers(numbers);
        int [] numbersDecending=orderDecendingArrayNumbers2(numbers);
        System.out.println(Arrays.toString(numbersDecending));

    }
    public static int[] getRandomNumber(int lent){
        Random random=new Random();
        int[] array=new int[lent];
        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(100);
        }
     return array;   
    }
    //First way
    public static int[] orderDecendingArrayNumbers(int[] array){
        for (int i=array.length-1; i>=0; i--){
            for(int j=array.length-1; j>=1; j--){
                if (array[j]>array[j-1]){
                    int tem=array[j-1];
                    array[j-1]=array[j];
                    array[j]=tem;
                }
            }           
        }
        return array;
    }
    //second way (more efficient)
    public static int[] orderDecendingArrayNumbers2(int[] array){
        boolean flag=true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0; i<array.length-1; i++){
                if(array[i]< array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag=true;
                }
            }
        }
        return array;
    }


}
