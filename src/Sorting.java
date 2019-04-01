import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    private int[] arrayList;
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime() {
        this.startTime = System.nanoTime();
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime() {
        this.endTime = System.nanoTime();
    }

    public Sorting(int length) {
        this.arrayList = randomArrayList(length);
    }

    public void tookTime(){
        System.out.println("Aega kulus " + (endTime - startTime) / 1000000.0 + " millisek");
    }

    public static int[] randomArrayList(int length) {
        int[] arrayList = new int[length];
        for (int i = 0; i < length; i++) {
            arrayList[i] = (int) (Math.random() * ((100 + 100) + 1)) - 100;
        }
        return arrayList;
    }

    public int[] getArrayList() {
        return arrayList;
    }

    @Override
    public String toString() {
        if (arrayList.length > 100) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Massiiv ületab üle saja elemendi, kas tahate, et väljastada massiiv? " +
                    "(jah/ei)");
            String answer = scanner.nextLine();
            if (answer.equals("jah")) {
                return "Algne massiiv: " + Arrays.toString(this.arrayList);
            } else {
                return "Massiiv, millel on " + arrayList.length + " pikkus";
            }
        } else {
            return "Algne massiiv: " + Arrays.toString(this.arrayList);
        }
    }
}
