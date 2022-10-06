public class InsertionSort {

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

    void sort(int[] data) {

        for (int datum : data) {
            System.out.printf("%d ", datum);
        }
        System.out.println("\n");

        int size = data.length;

        for (int i = 1; i < size; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && key < data[j]) {
                data[j + 1] = data[j];
                --j;
            }
            data[j + 1] = key;
        }
        for (int datum1 : data) {
            System.out.printf("%d ", datum1);
        }
        System.out.println("\n");
    }
}

