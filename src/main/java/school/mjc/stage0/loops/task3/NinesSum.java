package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String num = Integer.toString(lengthOfLastNumber);
        int number = 0;
        int summ = 0;
        if (lengthOfLastNumber<=0){
            summ = 0;
        } else {
            for (int i = 0; i<=lengthOfLastNumber-1; i++) {
                number = (int) (number + 9 * Math.pow(10, i));
                summ=summ+number;
            }
        }
        System.out.println(summ);


    }
}
