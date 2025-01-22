public class SmallNumber {

    public static void main(String[] args) {
        int[] numbers={7,4,3,9,1,5,0};

        int result=getSmallNumber(numbers);
        // result=numbers.length;
        System.out.println(result);
    }
    public static int getSmallNumber(int[] array){
        int small=array[0];
        for(int i=1; i<array.length;i++){
            if(array[i]>small){
                small=array[i];
            }
        }
        return small;
    }
}
