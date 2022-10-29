public class InsertionSort {

    int[] randomData;
    int[] largeSizeData;

    public InsertionSort(int[] randomData, int[] largeSizeData) {
        this.randomData = randomData;
        this.largeSizeData = largeSizeData;
    }

    int compCount = 0;
    public void countReset(){
        this.compCount = 0;
    }

    boolean compare(int x, int y){
        compCount++;
        return x > y;
    }
    void sort(int[] data) {

        for (int j= 1; j < data.length; j++) {
            int key = data[j];
            int i = j - 1;
            while (i >= 0 && compare(data[i],key)) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
    }
}

