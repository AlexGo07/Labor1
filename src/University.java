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
    public static int[] roundGrades(int[] grades){
        int[] roundGrades = new int[grades.length];
        for(int i=0;i<grades.length;i++)
        {
            int grade = grades[i];
            if(grade >= 38)
            {
                int next = ((grade/5)+1)*5;
                if(next - grade < 3)
                    grade = next;
            }
            roundGrades[i] = grade;
        }
        return roundGrades;
    }
    //4.
    public static int maxRounded(int[] grades)
    {
        int[] roundedGrades = roundGrades(grades);
        int max = roundedGrades[0];
        for(int i=1;i<roundedGrades.length;i++)
        {
            if(roundedGrades[i] > max)
                max = roundedGrades[i];
        }
        return max;
    }
}
