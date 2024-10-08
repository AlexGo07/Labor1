
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] badGrades = University.insufficient(grades);
        System.out.println("AUFGABE 1");
        System.out.print("Nicht ausreichende Noten: ");
        for(int i=0;i < badGrades.length;i++) {
            System.out.print(badGrades[i] + " ");
        }
        System.out.println();
        System.out.print("Durchschnitt: ");
        System.out.println(University.average(grades));
        System.out.print("abgerundete Noten: ");
        int[] roundedGrades = University.roundGrades(grades);
        for(int i=0;i < roundedGrades.length;i++) {
            System.out.print(roundedGrades[i] + " ");
        }
        System.out.println();
        System.out.print("Die hochste Note nach Aufrundung: ");
        System.out.println(University.maxRounded(grades));
        System.out.println();
        System.out.println("AUFGABE 2");
        int[] array = {4,8,3,10,17};
        System.out.println("Maxim: " + Numbers.maximal(array));
        System.out.println("Minim: " + Numbers.minimal(array));
        System.out.println("Maximale Sume: " + Numbers.sumMin(array));
        System.out.println("Minimale Sume: " + Numbers.sumMax(array));
    }
}


