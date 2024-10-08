public class Numbers {
    public static int maximal(int[] array)
    {
        int max = array[0];
        for(int i=0;i<array.length;i++)
        {
            if(max<array[i])
                max = array[i];
        }
        return max;
    }
    public static int minimal(int[] array)
    {
        int min = array[0];
        for(int i=0;i<array.length;i++)
            if(min>array[i])
                min = array[i];
        return min;
    }
    public static int sumMin(int[] array)
    {
        int sum = 0;
        int min = minimal(array);
        for(int i=0;i<array.length;i++)
        {
            sum += array[i];
        }
        return sum - min;
    }
    public static int sumMax(int[] array)
    {
        int max = maximal(array);
        int sum = 0;
        for(int i=0;i<array.length;i++) {
                sum += array[i];
        }
        return sum - max;
    }
}
