public class Big {
    public static int[] sume(int[] firstNumber, int[] secondNumber) {
        int[] sum = new int[firstNumber.length + 1];
        int carry = 0;
        for(int i = firstNumber.length - 1; i >= 0; i--) {
            int initialSum = firstNumber[i] + secondNumber[i] + carry;
            if (initialSum > 9) {
                carry = initialSum / 10;
                sum[i + 1] = initialSum % 10;
            }
            else
            {
                sum[i + 1] = initialSum;
                carry = 0;
            }
            sum[0] = carry;
        }
        return sum;
    }
}
