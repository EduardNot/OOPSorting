import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void generateAndPrintArray(int valik){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mitu array tahate teha?: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("Kui pikk on massiiv?:");
            int pikkus = scanner.nextInt();
            if (valik == 1){
                InsertionSort insertionSort = new InsertionSort(pikkus);
                insertionSort.sort(insertionSort.getArrayList());
            }
            else if (valik == 2){
                BubbleSort bubbleSort = new BubbleSort(pikkus);
                bubbleSort.sort(bubbleSort.getArrayList());
            }
            else if (valik == 3){
                MergeSort mergeSort = new MergeSort(pikkus);
                mergeSort.sort(mergeSort.getArrayList());
            }
            else if (valik == 4){
                QuickSort quickSort = new QuickSort(pikkus);
                quickSort.sort(quickSort.getArrayList());
            }
            else {
                Sorting sorting = new Sorting();
                int[] massiiv = sorting.setArrayValue(pikkus);
                sorting.setArrayList(massiiv);
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.sort(massiiv);

                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.sort(massiiv);

                MergeSort mergeSort = new MergeSort();
                mergeSort.sort(massiiv);

                QuickSort quickSort = new QuickSort();
                quickSort.sort(massiiv);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Tegemist on sorteerimis programmiga, kus käsitletakse erinevaid sorteerimis " +
                "algoritme.\n");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean kordus = true;
        while (kordus) {
            System.out.println("1. Kasutada kõik sorteerimis meetodid.");
            System.out.println("2. Valide kindel sorteerimis meetod.");
            System.out.println("3. Väljuda.");
            System.out.print("Palun tehke enda valik: ");
            number = scanner.nextInt();
            switch (number){

                case 1:
                    clearScreen();
                    generateAndPrintArray(5);
                    break;

                case 2:
                    clearScreen();
                    System.out.println("1. Insertionsort");
                    System.out.println("2. Bubblesort");
                    System.out.println("3. Mergesort");
                    System.out.println("4. Quicksort");
                    System.out.print("Palun tehke enda valik: ");
                    number = scanner.nextInt();
                    switch (number){
                        case 1:
                            clearScreen();
                            generateAndPrintArray(1);
                            break;

                        case 2:
                            clearScreen();
                            generateAndPrintArray(2);
                            break;
                        case 3:
                            clearScreen();
                            generateAndPrintArray(3);
                            break;
                        case 4:
                            clearScreen();
                            generateAndPrintArray(4);
                            break;
                    }

                case 3:
                    kordus = false;
                    break;
            }

//            System.out.println("Mitu array tahate teha?: ");
//            number = scanner.nextInt();
//
//            for (int i = 0; i < number; i++) {
//                System.out.println("Kui pikk massiiv?:");
//                int length = scanner.nextInt();
//
//            }
//            InsertionSort insertionSort = new InsertionSort(500);
//
//            insertionSort.sort(insertionSort.getArrayList());
        }
    }
}
