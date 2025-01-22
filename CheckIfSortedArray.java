public class CheckIfSortedArray {
    public static void main(String[] args) {

        int[] numbers = {1};

        boolean result = checkIfSorted(numbers);
        // result=numbers.length;
        System.out.println(result);
    }
    public static boolean checkIfSorted(int[] array) {
        //boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if(array[i]>=array[i-1]){
                continue;
            }
            return false;
        }
        return true;
    }
}