
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
        System.out.println();
        System.out.println("Aufgabe 3");
        int[] firstNumber = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] secondNumber = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] sumNumbers = Big.sume(firstNumber,secondNumber);
        System.out.print("Die Summe: ");
        for(int i=0;i < sumNumbers.length;i++) {
            System.out.print(sumNumbers[i] + " ");
        };
        System.out.println();
        System.out.print("Differenz: ");
        int[] firstNumber1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] secondNumber1 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] diffNumbers = Big.differenz(firstNumber1,secondNumber1);
        for(int i=0;i < diffNumbers.length;i++) {
            System.out.print(diffNumbers[i] + " ");
        }
        System.out.println();
        System.out.print("Multiplikation: ");
        int[] number = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int multiplier = 2;
        int[] multipliedNumbers = Big.multiplikation(number,multiplier);
        for(int i=0;i < number.length;i++) {
            System.out.print(multipliedNumbers[i] + " ");
        }
        System.out.println();
        int divisor = 2;
        System.out.print("Division: ");
        int[] dividedNumbers = Big.division(number,divisor);
        for(int i=0;i < dividedNumbers.length;i++) {
            System.out.print(dividedNumbers[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Aufgabe 4");
        int[] keybords = {40, 35, 70, 15, 45};
        System.out.print("Die billigste Tastatur ist: ");
        System.out.println(Shop.chepest(keybords));
        System.out.print("Das teuerste Gegenstand: ");
        int[] usb = {20,15,40,15};
        System.out.println(Shop.mostExpensiveThing(keybords,usb));
        int[] Preise = {15,45,20};
        int budget = 30;
        System.out.print("Teuerste Usb < Budget: ");
        System.out.println(Shop.mostExpensiveWithinBudget(Preise,budget));
        System.out.println();
    }
}


