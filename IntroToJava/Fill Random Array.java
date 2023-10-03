/**
 * Fill arrays randomly using seed, and perform operations on them
 *
 * @author Gabe Azzarita
 *
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExercises {

    public static int[] randomArray(Random rnd, int len) {
        int intArray[] = new int [len];
        int i = 0;
        for (i = 0; i < intArray.length; i++) {
            intArray[i] = rnd.nextInt(6)+1;
        }
        return intArray;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        int j = 0;
        for (j = 0; j < array.length; j++) {
            sum += array[j];
        }
        return sum;
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] arrayComb = new int [arr1.length + arr2.length];
        int i= 0, j = 0, k = 0;
        while ((i < arr1.length) && (j < arr2.length)){
            arrayComb[k++] = arr1[i++];
            arrayComb[k++] = arr2[j++]; 
        }
        return arrayComb;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a random seed: ");
        int seed = Integer.parseInt(input.nextLine());
        Random rnd = new Random(seed);
        int[] randomArray1 = randomArray(rnd, 6);
        System.out.print("First random array: ");
        System.out.println(Arrays.toString(randomArray1));
        int sum1 = sumArray(randomArray1);
        System.out.println("The total is: " + sum1);
        int[] randomArray2 = randomArray(rnd, 6);
        System.out.print("Next random array: ");
        System.out.println(Arrays.toString(randomArray2));
        int sum2 = sumArray(randomArray2);
        System.out.println("The total is: " + sum2);
        int[] merged = mergeArrays(randomArray1, randomArray2);
        System.out.print("The arrays merged are: ");
        System.out.println(Arrays.toString(merged));
        input.close();
    }

}
