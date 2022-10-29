public class MergeSort {
    int[] randomData ;
    int[] LargeSizeData ;
    int compCount = 0;
    public void countReset(){
        this.compCount = 0;
    }

    boolean compare(int x, int y){
        compCount++;
        return x > y;
    }
    public MergeSort(int[] randomData, int[] largeSizeData) {
        this.randomData = randomData;
        LargeSizeData = largeSizeData;
    }
    void merge(int[] data, int p, int q, int r) {

        int n1 = q - p;
        int n2 = r - q;

        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        for (int i = 0; i < n1; i++)
            L[i] = data[p + i];

        for (int j = 0; j < n2; j++)
            R[j] = data[q + j];

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = p; k<r;k++) {
            if (compare(L[i],R[j])) {
                data[k] = L[i];
                i++;
            }else {
                data[k] = L[i];
                j++;
            }
        }
    }

    void sort(int[] data, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(data, p, q);
            sort(data, q+1, r);
            merge(data, p, q, r);
        }
    }

}
