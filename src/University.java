public class University {
    //1.
    public static int[] insufficient(int[] grades) throws IllegalAccessException {
        int count = 0;
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i] > 100 || grades[i] < 0)
                throw new IllegalAccessException("incompatible grade");
            else if(grades[i] < 40)
                count++;
        }
        int[] badGrades = new int[count];
        for(int i=0;i<badGrades.length;i++)
        {
            if(grades[i] < 40)
                badGrades[i]=grades[i];
        }
        return badGrades;
    }
    //2.
    public static double average(int[] grades) throws IllegalAccessException {
        int sum = 0;
        for(int i=0;i<grades.length;i++)
        {
            sum += grades[i];
        }
        return Math.round(((double) sum / grades.length) * 100.0) / 100.0;
    }
    //3.

}
