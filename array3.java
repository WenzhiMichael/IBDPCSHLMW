public class array3 {

    public static void main(String[] args) {
        int largeArray [] = {12,323,12,321,23,341,2131,634};

        int smallest = largeArray [0];
        int largest = largeArray [0];

        for (int i = 0; i<=7; i++){
            if (largeArray [i] < smallest) smallest = largeArray [i];
            if (largeArray [i] > largest) largest = largeArray [i];

        }

        System.out.println ("The smallest value in the Array is  " + smallest);
        System.out.println ("The largest value in the Array is  " + largest);
    }

}
