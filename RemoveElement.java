import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array={5,3,6,8,1,0,3,4};
        int element=4;
        int[] result=removeElement(array,element);
        System.out.println(Arrays.toString(result));
    }
    public static int[] removeElement(int[] array,int element){

        int cont=0;
        for(int i=0; i<array.length;i++){
            if(array[i]==element){
                   cont++;
            }
        }
        int[] result=new int[array.length-cont];
        int j=0;
        for(int i=0; i<array.length;i++){
            if(array[i]!=element){
                result[j]=array[i];
                j++;
            }
        }
        return result;
    }
}
