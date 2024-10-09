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
}
