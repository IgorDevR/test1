import java.util.Arrays;
import java.util.Collections;

public class Main{

    private static Integer[] arr = new Integer[] {1,2,3,4,5,6};

    public static void main(String[] arg){

        System.out.print("Orig array ");
        printArray();

        System.out.print("reversePrintArray  ");
        reversePrintArray();

        System.out.print("reverseArrayInLoop  ");
        reverseArrayInLoop();
        printArray();

        System.out.print("reverseArrayInCollections  ");
        reverseArrayInCollections();
        printArray();

    }

    private static void reversePrintArray(){

        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[arr.length - 1 - i] + " ");
        }
        System.out.println();

    }

    private static void reverseArrayInLoop(){

        int temp = 0;

        for(int i = 0; i < arr.length/2;i++){

            temp  = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }

    }

    private static void reverseArrayInCollections(){

        Collections.reverse(Arrays.asList(arr));

    }

    private static void printArray(){

        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


}
