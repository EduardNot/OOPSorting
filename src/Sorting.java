public abstract class Sorting {
    public static int[] randomArrayList(int length){
        int[] arrayList = new int[length];
        for (int i = 0; i < length; i++) {
            arrayList[i] = (int) (Math.random() * ((100 + 100) + 1)) - 100;
        }
        return arrayList;
    }
}
