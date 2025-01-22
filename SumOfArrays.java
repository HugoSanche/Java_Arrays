public class SumOfArrays {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};

        int result=sumValues(numbers);
        // result=numbers.length;
        System.out.println(result);


    }
    public static int sumValues(int[] array){
        int sum=0;
        for(int i=0; i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }
}


