import java.util.Arrays;

public class TwoDimensional{
    public static void main(String[] args) {

        int[][] array; //first way to declare a array more commun
        int[] array2[]; //second way to declare a array


        //array with 3 elements
        int[][] oneExample={{1,2},
                                {3,4,5},
                                {6,7,8}};
        int[][] twoExample= new int[3][3];
        //{{0,0,0},
        //{0,0,0},
        //{0,0,0}}
        
        int[][] iterate={{1,2,3},
        {4,5,6},
        {7,8,9}};

        int[][] threeExample= new int[3][];
        //{{null},
        //{null},
        //{null}}

        //ways to print a two dimensional array
        System.out.println("*************PRINT************");

        //firts one
        for (int[] elements: iterate){
            System.out.println(Arrays.toString(elements));
        }
        System.out.println("*************************");
       //SECOND WAY
        for (int i=0; i<iterate.length; i++ ){
            for (int j=0; j<iterate.length; j++){
                System.out.print(iterate[i][j]+" ");
            }
            System.out.println();
        } 
        //three way
        System.out.println("*************************");
        for (var renglones: iterate){
            for(var columnas: renglones ){
                System.out.print(columnas+" ");
            }
            System.out.println();
        }     
        System.out.println("*************************");
        //four way
        System.out.println(Arrays.deepToString(iterate)); 
    }
}