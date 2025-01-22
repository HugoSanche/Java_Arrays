public class GetLength {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};

        int result=getLength(numbers);
       // result=numbers.length;
        System.out.println(result);


    }
    public static int getLength(int[] array){
        int res=0;
        for(int i=0; i<array.length;i++){
            res++;
        }
        return res;
    }
}
