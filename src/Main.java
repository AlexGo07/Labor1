
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] badGrades = University.insufficient(grades);
        System.out.println("Aufgabe 1");
        System.out.print("Nicht ausreichende Noten: ");
        for(int i=0;i < badGrades.length;i++) {
            System.out.print(badGrades[i] + " ");
        }
        System.out.println();
        System.out.print("Durchschnitt:");
        System.out.println(University.average(grades));
    }
}


