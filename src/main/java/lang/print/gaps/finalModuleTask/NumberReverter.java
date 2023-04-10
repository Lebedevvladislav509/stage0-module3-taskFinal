package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int revert = 0;
        int lastNum1 = number % 10;
        int result = revert * 10 + lastNum1;
        int number2 = number / 10;

        int lastNum2 = number2 % 10;
        result = result * 10 + lastNum2;
        int number3 = number2 / 10;

        int lastNum3 = number3 % 10;
        result = result * 10 + lastNum3;
        System.out.println(result);

    }
}
