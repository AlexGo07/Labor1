public class Shop {
    public static int chepest(int[] keyboardPrices)
    {
        int min = keyboardPrices[0];
        for(int i = 1; i < keyboardPrices.length - 1; i++)
        {
            if(min > keyboardPrices[i])
                min = keyboardPrices[i];
        }
        return min;
    }
    public static int mostExpensiveThing(int[] keyboardPrices, int[] usbDevice)
    {
        int max = keyboardPrices[0];
        for(int i = 1; i < keyboardPrices.length - 1; i++)
            if(max < keyboardPrices[i])
                max = keyboardPrices[i];
        for(int i = 1; i < usbDevice.length - 1; i++)
            if(max < usbDevice[i])
                max = usbDevice[i];
        return max;
    }
    public static int mostExpensiveWithinBudget(int[] usbPrices, int budget)
    {
        int max = usbPrices[0];
        for(int i = 1; i < usbPrices.length; i++)
        {
            if(max < usbPrices[i] && budget >= usbPrices[i])
            {
                max = usbPrices[i];
            }
        }
        return max;
    }
    public static int maximalSum(int budget, int[] keyboardPrices, int[] usbDevice)
    {
        int sum;
        int max = -1;
        for(int i = 1; i < keyboardPrices.length; i++)
            for(int j = 0; j < usbDevice.length; j++)
            {
                sum = keyboardPrices[i] + usbDevice[j];
                if(sum > max && sum <= budget)
                    max = sum;
            }
        return max;
    }
}
