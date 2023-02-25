public class ExampleArray{
    public static void main(String[] Args){
        int[] myArray=new int[10];
        //start with position 0
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;
        System.out.println(myArray[2]);

        //other way to initializate 
        int[] otherExample= {1,2,3};

        //using lenght
        //length doesnot start with 0 start with 1
        System.out.println("The first element "+otherExample[0]);
        System.out.println("The last element "+otherExample[otherExample.length-1]);

        //other way to declarate
        int[] secondArray;
        secondArray=new int[]{1,2,3};

        //iterate 
        for (int i=0; i<secondArray.length; i++){
            System.out.print(secondArray[i]+" ");
        }

    }
}