public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers={0,40,3,5,1,6,7};

        int result=getSecondLargestNumber(numbers);
        // result=numbers.length;
        System.out.println(result);
    }
    public static int getSecondLargestNumber(int[] numbers){
        int temp=numbers[0];
        int largest=numbers[0];
        boolean flag=false;
        for (int i=1; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
                flag=true;
            }
            if(temp<numbers[i] && flag && i>1){
                temp=numbers[i];
            }
        }
        return temp;
    }
}
