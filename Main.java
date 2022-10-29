/**201910926김동현 Algorithm Programming Assignment*/
public class Main {
    public static void main(String[] args){
        int[] sortedData = {2,4,7,9,10,12,14,15,16,18,19,20,24,25,26,27,29,30,31,35,36,37,38,39,43,52,59,60,62,63,64,65};
        int[] randomData= new int[32];
        int[] largeSizeData = new int[1024];
        int[] data;

        //Generate Randomly Data
        for (int i =0; i<32; i++){
            int random = (int)(Math.random() * 100);
            randomData[i] = random;
        }

        //Generate LargeSize Data
        for (int i =0; i<1024; i++){
            int random = (int)(Math.random() * 1000);
            largeSizeData[i] = random;
        }

        InsertionSort insertionSort = new InsertionSort(randomData,largeSizeData);
        HeapSort heapSort = new HeapSort(randomData,largeSizeData);
        MergeSort mergeSort = new MergeSort(randomData,largeSizeData);
        QuickSort quickSort = new QuickSort(randomData,largeSizeData);
        long start;
        long finish;


        /**
         * Insertion sort*/
        //Sorted Data
        data = sortedData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");

        start = System.nanoTime();
        insertionSort.sort(data);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while insertion sort! : sorted data\n");
        System.out.println("COMPCOUNT : " + insertionSort.compCount);
        insertionSort.countReset();

        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");

        // Randomly Generated Data
        data = randomData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        insertionSort.sort(data);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while insertion sort! : Randomly Generated Data\n");
        System.out.println("COMPCOUNT :"+insertionSort.compCount);
        insertionSort.countReset();
        data = randomData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");

        //Large Size Data
        data = largeSizeData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        insertionSort.sort(data);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while insertion sort! : Large Size Data\n");
        System.out.println("COMPCOUNT :"+insertionSort.compCount);
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");


        /**
         * Heap sort*/

        //Sorted Data
        data = sortedData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        heapSort.sort(data);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while heap sort! : sorted data\n");
        System.out.println("COMPCOUNT :"+heapSort.compCount);
        heapSort.countReset();
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");

        //Randomly Generated Data
        data = randomData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        heapSort.sort(data);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while heap sort! : Randomly Generated Data \n");
        System.out.println("COMPCOUNT :"+heapSort.compCount);
        heapSort.countReset();
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");


        //Large Size Data
        data = largeSizeData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        heapSort.sort(data);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while heap sort! : Large Size Data\n");
        System.out.println("COMPCOUNT :"+heapSort.compCount);
        heapSort.countReset();
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");

        /**
         * Merge sort*/

        //Sorted Data
        data = sortedData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        mergeSort.sort(data,0,data.length-1);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while merge sort! : sorted data\n");
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");

        //Randomly Generated Data
        data = randomData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        mergeSort.sort(data, 0,data.length-1);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while merge sort! : Randomly Generated Data \n");
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");

        //Large Size Data
        data = largeSizeData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        mergeSort.sort(data, 0, data.length-1);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while merge sort! : Large Size Data\n");
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");


        /**
         * Quick sort*/

        //Sorted Data
        data = sortedData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        quickSort.sort(data,0,data.length-1);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while quick sort! : sorted data\n");
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");

        //Randomly Generated Data
        data = randomData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        quickSort.sort(data, 0,data.length-1);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while quick sort! : Randomly Generated Data \n");
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");

        //Large Size Data
        data = largeSizeData;
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");
        start = System.nanoTime();
        quickSort.sort(data, 0, data.length-1);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while quick sort! : Large Size Data\n");
        for (int datum : data) {
            System.out.printf("%d, ", datum);
        }
        System.out.println("\n");

    }
}
