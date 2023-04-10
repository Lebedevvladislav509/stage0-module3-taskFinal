package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int res1 = number % 10;
        number = number / 10;
        int res2 = number % 10;
        number = number / 10;
        int res3 = number % 10;
        number = number / 10;
        int res4 = number % 10;
        System.out.println(res1 + res2 + res3 + res4);

    }
}
