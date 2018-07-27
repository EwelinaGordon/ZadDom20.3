//problem nr 5

public class ProblemEuler {

   public int giveNumber(int divider) {

        int number = 1;
        boolean anyRemainder = false;

        do {
            int i;
            for (i = 1; i <= divider; i++) {
                if ((number % i) != 0) {
                    number = number + 1;
                    break;
                }
            }
            if (i > divider)
                anyRemainder = true;

        }
        while (!anyRemainder);

        return number;

    }
}
