import java.util.Arrays;

public class Utilities {
    public static void main(String[] args) {
        int[] array={5,4,9,1,8,2};

        String str= Arrays.toString(array);
        System.out.println(str);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] copy=Arrays.copyOf(array,10);
        System.out.println(Arrays.toString(copy));

       Arrays.fill(array,3);
        System.out.println(Arrays.toString(array));

        boolean res=Arrays.equals(array,copy);
        System.out.println(res);
    }
}
