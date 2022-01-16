public class loop {
    public static void main (String [] args ) {

        //Statement 1 is executed (one time) before the execution of the code block.
        //Statement 2 defines the condition for executing the code block.
        //Statement 3 is executed (every time) after the code block has been executed.

        for(int a = 1000; a >= 0 ; a= a -2){
            System.out.println(a);
    }

        System.out.println("Loop is finished");
    }

}
