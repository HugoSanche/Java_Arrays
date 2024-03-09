import java.util.Arrays;

public class Test_Array {
    public static void main(String[] args) {
         int array1[]={1,2,3};
         int array2[]={8,5,6};
         int array3[]={8,5,6};

         int multiarray[][]={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(array1);

        //compare two arrays
        System.out.println(Arrays.equals(array2,array3));
        if(Arrays.equals(array2,array3)){
            System.out.println("Son iguales");
        }


        System.out.println("*******************************************************************");
        //print array
        System.out.println(Arrays.toString(array1));
        for(int array:array1){
            System.out.println(array);
        }

        System.out.println("*******************************************************************");
        //print multidimensional array
        System.out.println(Arrays.deepToString(multiarray).toString());
        for(int array[]:multiarray){
            for(int arrayb:array){
                System.out.println(arrayb);
            }
        }
        System.out.println("*******************************************************************");
        System.out.println(Arrays.stream(array2).max());

        int marks[];
        marks=new int[5];

        int marks0[][]=new int[1][5];
        int marks1[][]=new int[5][];
        //int marks2[][]=new int[][5]; //compile error

    }
    public void test(){
        //compare two arrays

    }
}
