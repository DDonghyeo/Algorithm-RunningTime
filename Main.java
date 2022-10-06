/**201910926김동현 Algorithm Programming Assignment*/
public class Main {
    public static void main(String[] args){
        int[] sortedData = {2,4,7,9,10,12,14,15,16,18,19,20,24,25,26,27,29,30,31,35,36,37,38,39,43,52,59,60,62,63,64,65};
        int[] randomData= new int[32];
        int[] largeSizeData = new int[1024];

        //Randomly Generate Data
        for (int i =0; i<32; i++){
            int random = (int)(Math.random() * 100);
            randomData[i] = random;
        }

        //LargeSize Data Generate
        for (int i =0; i<1024; i++){
            int random = (int)(Math.random() * 1000);
            largeSizeData[i] = random;
        }

        InsertionSort insertionSort = new InsertionSort();
        HeapSort heapSort = new HeapSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        long start;
        long finish;

        insertionSort.setSortedData(sortedData);
        insertionSort.setRandomData(randomData);
        insertionSort.setLargeSizeData(largeSizeData);

        heapSort.setSortedData(sortedData);
        heapSort.setRandomData(randomData);
        heapSort.setLargeSizeData(largeSizeData);

        mergeSort.setSortedData(sortedData);
        mergeSort.setRandomData(randomData);
        mergeSort.setLargeSizeData(largeSizeData);

        quickSort.setSortedData(sortedData);
        quickSort.setRandomData(randomData);
        quickSort.setLargeSizeData(largeSizeData);
        /**
         * Insertion sort*/
        //Sorted Data


//        start = System.nanoTime();
//        insertionSort.sort(insertionSort.sortedData);
//        finish = System.nanoTime();
//        System.out.println((finish-start)+"  time spent while insertion sort! : sorted data");

        //Randomly Generated Data
        start = System.nanoTime();
        insertionSort.sort(insertionSort.randomData);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while insertion sort! : Randomly Generated Data");

        //Large Size Data
//        start = System.nanoTime();
//        insertionSort.sort(insertionSort.LargeSizeData);
//        finish = System.nanoTime();
//        System.out.println((finish-start)+"  time spent while insertion sort! : Large Size Data\n");


        /**
         * Heap sort*/


        //Sorted Data
//        start = System.nanoTime();
//        heapSort.sort(heapSort.sortedData);
//        finish = System.nanoTime();
//        System.out.println((finish-start)+"  time spent while heap sort! : sorted data");

        //Randomly Generated Data
        start = System.nanoTime();
        heapSort.sort(heapSort.randomData);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while heap sort! : Randomly Generated Data");

        //Large Size Data
//        start = System.nanoTime();
//        heapSort.sort(heapSort.LargeSizeData);
//        finish = System.nanoTime();
//        System.out.println((finish-start)+"  time spent while heap sort! : Large Size Data\n");

        /**
         * Merge sort*/


//        start = System.nanoTime();
//        mergeSort.sort(mergeSort.sortedData,0,(mergeSort.sortedData.length-1)/2,mergeSort.sortedData.length-1);
//        finish = System.nanoTime();
//        System.out.println((finish-start)+"  time spent while merge sort! : sorted data");

        //Randomly Generated Data
        start = System.nanoTime();
        mergeSort.sort(mergeSort.randomData, 0,(mergeSort.randomData.length-1)/2,mergeSort.randomData.length-1);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while merge sort! : Randomly Generated Data");

        //Large Size Data
//        start = System.nanoTime();
//        mergeSort.sort(mergeSort.LargeSizeData, 0,(mergeSort.LargeSizeData.length-1)/2, mergeSort.LargeSizeData.length-1);
//        finish = System.nanoTime();
//        System.out.println((finish-start)+"  time spent while merge sort! : Large Size Data\n");


        /**
         * Quick sort*/


//        start = System.nanoTime();
//        quickSort.sort(quickSort.sortedData,0,quickSort.sortedData.length-1);
//        finish = System.nanoTime();
//        System.out.println((finish-start)+"  time spent while merge sort! : sorted data");

        //Randomly Generated Data
        start = System.nanoTime();
        quickSort.sort(quickSort.randomData, 0,quickSort.randomData.length-1);
        finish = System.nanoTime();
        System.out.println((finish-start)+"  time spent while merge sort! : Randomly Generated Data");

        //Large Size Data
//        start = System.nanoTime();
//        mergeSort.sort(mergeSort.LargeSizeData, 0,(mergeSort.LargeSizeData.length-1)/2, mergeSort.LargeSizeData.length-1);
//        finish = System.nanoTime();
//        System.out.println((finish-start)+"  time spent while merge sort! : Large Size Data\n");

    }
}
