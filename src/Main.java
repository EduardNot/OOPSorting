import java.util.Scanner;

public class Main {


    public static void generateAndPrintArray(int valik){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mitu massiivi soovite luua?: ");
        int number = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.print("Kui pikk on " + (i + 1) + " massiiv?: ");
            int pikkus = scanner.nextInt();
            System.out.println();
            if (valik == 1){
                InsertionSort insertionSort = new InsertionSort(pikkus);
                System.out.println("Tegemist on 'insertion sort' meetodiga.");
                insertionSort.sort(insertionSort.getArrayList());
            }
            else if (valik == 2){
                System.out.println("Tegemist on 'bubble sort' meetodiga.");
                BubbleSort bubbleSort = new BubbleSort(pikkus);
                bubbleSort.sort(bubbleSort.getArrayList());
            }
            else if (valik == 3){
                MergeSort mergeSort = new MergeSort(pikkus);
                System.out.println("Tegemist on 'merge sort' meetodiga");
                mergeSort.sort(mergeSort.getArrayList());
            }
            else if (valik == 4){
                QuickSort quickSort = new QuickSort(pikkus);
                System.out.println("Tegemist on 'quick sort' meetodiga.");
                quickSort.sort(quickSort.getArrayList());
            }
            else {
                Sorting sorting = new Sorting();
                int[] massiiv = sorting.setArrayValue(pikkus);
                System.out.println("Tegemist on 'insertion sort' meetodiga.");
                InsertionSort insertionSort = new InsertionSort(massiiv);
                insertionSort.sort(massiiv.clone());

                System.out.println("Tegemist on 'bubble sort' meetodiga.");
                BubbleSort bubbleSort = new BubbleSort(massiiv);
                bubbleSort.sort(massiiv.clone());

                System.out.println("Tegemist on 'merge sort' meetodiga");
                MergeSort mergeSort = new MergeSort(massiiv);
                mergeSort.sort(massiiv.clone());

                System.out.println("Tegemist on 'quick sort' meetodiga.");
                QuickSort quickSort = new QuickSort(massiiv);
                quickSort.sort(massiiv.clone());
            }
        }
    }

    public static void input(){
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        boolean kordus = true;
        while (kordus) {
            System.out.println("1. Vali kõik sortimismeetodid");
            System.out.println("2. Vali kindel sortimismeetod");
            System.out.println("3. Välju");
            System.out.print("Tee enda valik: ");
            number1 = scanner.nextInt();
            System.out.println();
            switch (number1){

                case 1:
                    generateAndPrintArray(5);
                    break;

                case 2:
                    System.out.println("1. Insertion sort");
                    System.out.println("2. Bubble sort");
                    System.out.println("3. Merge sort");
                    System.out.println("4. Quick sort");
                    System.out.print("Tee enda valik: ");
                    int number2 = scanner.nextInt();
                    System.out.println();
                    switch (number2){
                        case 1:
                            generateAndPrintArray(1);
                            break;

                        case 2:
                            generateAndPrintArray(2);
                            break;
                        case 3:
                            generateAndPrintArray(3);
                            break;
                        case 4:
                            generateAndPrintArray(4);
                            break;
                    }
                    break;

                case 3:
                    kordus = false;
                    break;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Tegemist on programmiga mis implementeerib objektorienteeritult erinevaid " +
                "sortimisalgoritme ja mõõdab nende töökiirust.\n");
        input();
    }
}
