

import java.util.*;
import java.util.concurrent.ExecutionException;

class DiffDemo {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(start);
            System.out.println(new Date() + "\n");
            Thread.sleep(5 * 60 * 10);

            long end = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            long diff = (end - start);
            System.out.println("Difference is : " + diff + " milliseconds");
        } catch (Exception e) {
            System.out.println("Got sn exception!");

        }
    }
}