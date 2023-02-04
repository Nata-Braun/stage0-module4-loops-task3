package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fib1 = 0;
        int fib2 =1;
        int fibNext = 0;
        System.out.println(fib1 + "\n" + fib2);
        for (int i=3; i<=lastFibonacci; i++) {
            fibNext = fib1 + fib2;
            System.out.println(fibNext);

            fib1 = fib2;
            fib2 = fibNext;
        }


    }
}
