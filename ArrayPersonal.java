package arrays;
import java.util.Arrays;

public class ArrayPersonal {
    public static void main(String[] args) {

        int[] numbers = new int[]{23, 123, 24, -12, 1221, 121, 32, 141};
        int array[] = {223, 123, 24, -12, 1221, 121, 32, 141};

        int total = 0;
        for (int i = 0; i < numbers.length; i++)
            total = total + numbers[i];

        double average = total / numbers.length;
        System.out.println("Average value of the array elements is : " + average);

        Arrays.sort(array);
        for (int i = 0; i <= array.length - 1; i++) {

            System.out.println(array[i]);

        }
    }
}



