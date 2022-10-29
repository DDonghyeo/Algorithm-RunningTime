public class HeapSort {

    int[] randomData ;
    int[] LargeSizeData;

    int compCount = 0;

    public HeapSort(int[] randomData, int[] largeSizeData) {
        this.randomData = randomData;
        LargeSizeData = largeSizeData;
    }

    public void countReset(){
        this.compCount = 0;
    }
    boolean compare(int x, int y){
        compCount++;
        return x > y;
    }

    public void sort(int data[]) {
       BuildMaxHeap(data);

        // Heap sort
        for (int i = data.length -1; i >= 0; i--) {
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;

            MaxHeapify(data, i);
        }
    }


    void MaxHeapify(int[] data, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest=i;

        if (l <= data.length-1) {
            if (compare(data[l], data[i])) {
                largest = l;
            }
        }
        if (r <= data.length-1) {
            if (compare(data[r], data[i])) {
                largest = r;
            }
        }

        if (largest != i) {
            int swap = data[i];
            data[i] = data[largest];
            data[largest] = swap;
            MaxHeapify(data,i);
        }
    }

    void BuildMaxHeap(int [] data){
        for (int i = (int) Math.floor(data.length/2); i>=0; i-- ){
            MaxHeapify(data,i);
        }
    }
}

