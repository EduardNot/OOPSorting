import java.util.Arrays;

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
        return "Algne massiiv: " +Arrays.toString(this.arrayList);
    }
}
