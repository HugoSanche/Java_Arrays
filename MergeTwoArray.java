import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] one={10,20,30};
        int[] two={40,50,60};

        int[] resultado=merge(one,two);
        System.out.println(Arrays.toString(resultado));
    }
    public static int[] merge(int[] one,int[]two){
        int[] mergeArray=new int[one.length+two.length];
        for(int i=0; i<one.length; i++){
            mergeArray[i]=one[i];
        }
        for(int i=0;i<two.length;i++){
            mergeArray[one.length+i]=two[i];
        }
        return mergeArray;
    }
}
