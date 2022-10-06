public class MergeSort {
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

    public void sort(int data[], int p, int q, int r) {
        for (int datum : data) {
            System.out.printf("%d ", datum);
        }
        System.out.println("\n");
        // Create L ← A[p..q] and M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = data[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = data[q + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            data[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            data[k] = M[j];
            j++;
            k++;
        }
        for (int datum : data) {
            System.out.printf("%d ", datum);
        }
        System.out.println("\n");

    }

}
