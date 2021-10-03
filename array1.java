
    import java.util.Scanner;
    public class array1 {
        public static void main(String[] args) {

            int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

            int total = 0;
            for(int i=0; i < numbers.length ; i++)
                total = total + numbers[i];

            double average = total / numbers.length;
            System.out.println("Average value of the array elements is : " + average);
        }
    }


