public class Big {
    public static int[] sume(int[] firstNumber, int[] secondNumber) {
        int[] sum = new int[firstNumber.length + 1];
        int carry = 0;
        for (int i = firstNumber.length - 1; i >= 0; i--) {
            int initialSum = firstNumber[i] + secondNumber[i] + carry;
            if (initialSum > 9) {
                carry = initialSum / 10;
                sum[i + 1] = initialSum % 10;
            } else {
                sum[i + 1] = initialSum;
                carry = 0;
            }
            sum[0] = carry;
        }
        return sum;
    }

    public static boolean biggerNumber(int[] firstNumber, int[] secondNumber) {
        for (int i = 0; i < firstNumber.length; i++) {
            if (firstNumber[i] > secondNumber[i])
                return true;
            else if (firstNumber[i] < secondNumber[i])
                return false;
        }
        return true;
    }

    public static int[] differenz(int[] firstNumber, int[] secondNumber) {
        if (!biggerNumber(firstNumber, secondNumber))
            return differenz(secondNumber, firstNumber);
        int[] diff = new int[firstNumber.length];
        int borrow = 0;
        for (int i = firstNumber.length - 1; i >= 0; i--) {
            int initialDiff = firstNumber[i] - secondNumber[i] - borrow;
            if (initialDiff < 0) {
                initialDiff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            diff[i] = initialDiff;
        }
        return diff;
    }

    public static int[] multiplikation(int[] number, int multiplier) {
        int[] mult = new int[number.length + 1];
        int carry = 0;
        for (int i = number.length - 1; i >= 0; i--) {
            int initialMult = number[i] * multiplier + carry;
                carry = initialMult / 10;
                mult[i + 1] = initialMult % 10;
            }
        mult[0] = carry;
        if (carry == 0) {
            int[] newResult = new int[mult.length - 1];
            for (int i = 1; i < mult.length; i++) {
                newResult[i - 1] = mult[i];
            }
            return newResult;
        }

        return mult;
    }
}