package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String num = Integer.toString(t);
        int counter = num.length();
        int summ = 0;
        for (int i = 0; i<=counter-1; i++){
            summ = (int) (summ + Math.abs((t/Math.pow(10,i))%10));
        }
        System.out.println(summ);

    }
}
