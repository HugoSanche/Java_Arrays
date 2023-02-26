import java.lang.reflect.Array;
import java.util.Arrays;

public class Multimensional {
    public static void main(String[] args) {
        Object[] array= new Object[3];
        array[0]=new int[][] {{1,2,3},{4,5,6}};
        array[1]=new String[] {"a","b","c"};
       // array[2]= new ExampleArray(); 
       array[2]= new int[3][3][3];

        System.out.println(Arrays.deepToString(array));
        for(Object elements:array)
        {   
            System.out.println("Type "+elements.getClass().getSimpleName());
            System.out.println("Elements to String "+elements);
            System.out.println(Arrays.deepToString((Object[]) elements));
        }
    }
}
