import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    private int[] arrayList;
    private long startTime;
    private long endTime;
    private boolean toStringAnswer = false;
    private int[] originalArray;

    public Sorting(int length) {
        this.arrayList = setArrayValue(length);
    }

    public Sorting(int[] array){ this.arrayList = array; }

    public Sorting(){}

    public int[] setArrayValue(int length) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Massiivi väärtused genereeritakse suvaliselt ");
        System.out.println("2. Kasutaja sisestab ise massiivi väärtused ");
        System.out.print("Sisestage enda valik: ");
        int number = scanner.nextInt();
        System.out.println();
        int[] arrayList = new int[length];
        if (number == 1) {
            for (int i = 0; i < length; i++) {
                arrayList[i] = (int) (Math.random() * ((100 + 100) + 1)) - 100;
            }
        }
        else if (number == 2){
            for (int j = 0; j < length; j++) {
                System.out.println("Sisestage " + (j+1) + ". number: ");
                arrayList[j] = scanner.nextInt();
            }
        }
        return arrayList;
    }

    public void toStringQuestion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massiivi suurus ületab 50 elementi, kas soovite antud massiivi väljastada? " +
                "(jah/ei)");
        String answer = scanner.nextLine();
        if (answer.equals("jah")){
            toStringAnswer = true;
        }
        else {
            toStringAnswer = false;
        }
    }



    public int[] getArrayList() { return arrayList; }

    public void setArrayList(int[] arrayList) {
        this.arrayList = arrayList;
    }

    public boolean isToStringAnswer() {
        return toStringAnswer;
    }

    public void setOriginalArray(int[] arrayList) {
        this.originalArray = arrayList.clone();
    }

    public void setStartTime() {
        this.startTime = System.nanoTime();
    }

    public void setEndTime() {
        this.endTime = System.nanoTime();
    }

    public void tookTime(){
        System.out.println("Aega kulus " + (endTime - startTime) / 1000000.0 + " millisek");
    }

    @Override
    public String toString() {
        if (arrayList.length > 50) {
            toStringQuestion();
            if (isToStringAnswer()) {
                return "Antud massiiv: " + Arrays.toString(originalArray) + "\nSorteeritud massiiv: " + Arrays.toString(arrayList) + "\n";
            } else {
                return "Antud massiiv, millel on  " + arrayList.length + " elementi.\nSortteertud massiiv, " +
                        "millel " +
                        "on " + arrayList.length +
                        " elementi.\n";
            }
        } else {
            return "Antud massiiv: " + Arrays.toString(originalArray) + "\nSorteeritud massiiv: " + Arrays.toString(arrayList) + "\n";
        }
    }
}
