public class QuickSort {
    int[] randomData = new int[32];
    int[] LargeSizeData = new int[1024];

    int compCount = 0;

    public QuickSort(int[] randomData, int[] largeSizeData) {
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
     int partition(int[] data, int p, int r) {

        int x = data[r];

        int i = p - 1;

        for (int j = p; j < r; j++) {
            if (compare(data[j],x)) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }

        }
        int temp = data[i + 1];
        data[i + 1] = data[r];
        data[r] = temp;
        return i + 1;
    }

    public void sort(int[] data, int p, int r) {

        if (p < r){
            int q = partition(data, p, r);
            sort(data, p, q - 1);
            sort(data, q + 1, r);
        }

    }
}
