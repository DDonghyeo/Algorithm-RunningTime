public class HeapSort {

    int[] sortedData;
    int[] randomData;
    int[] LargeSizeData;

    public void setSortedData(int[] data){
        this.sortedData = data;
    }

    public void setRandomData(int[]data){
        this.randomData = data;
    }

    public void setLargeSizeData(int[] data){
        this.LargeSizeData = data;
    }

    public void sort(int[] data) {
        for (int datum : data) {
            System.out.printf("%d ", datum);
        }
        System.out.println("\n");

        int n = data.length;

        // Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(data, n, i);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;

            heapify(data, i, 0);
        }
        for (int datum : data) {
            System.out.printf("%d ", datum);
        }
        System.out.println("\n");
    }

    void heapify(int[] data, int n, int i) {
        int biggest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && data[left] > data[biggest])
            biggest = left;

        if (right < n && data[right] > data[biggest])
            biggest = right;

        if (biggest != i) {
            int swap = data[i];
            data[i] = data[biggest];
            data[biggest] = swap;

            heapify(data, n, biggest);
        }
    }
}

