import java.util.Arrays;

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
        //secondArray=new int[]{1,2,3};
        secondArray=new int[5];
        //iterate 
        for (int i=0; i<secondArray.length; i++){
            secondArray[i]=secondArray.length-i;
        }
        for (int i=0; i<secondArray.length; i++){
            System.out.print(secondArray[i]+" ");
        }
        System.out.println();

        //variable elemento its the value of array not the indice
        for (int elemento: secondArray){
            System.out.print(elemento+" ");
        }
        System.out.println();
        //array its a intance of class and call method toString
        System.out.println(secondArray);

        //Other way to print array
        System.out.println(Arrays.toString(secondArray));

        Object objectArray=secondArray;
        if (objectArray instanceof int[]){
            System.out.println("ObjectArray its an int array");
        }

        //Object array recibe many types of data
        //including a reference of class
        Object[] myObject =new Object[5];
        myObject[0]=1;
        myObject[1]="Hugo";
        myObject[2]=22.22;
        myObject[3]=new StringBuilder();





    }
}