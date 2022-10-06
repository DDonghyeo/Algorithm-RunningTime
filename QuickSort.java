public class QuickSort {
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

    // method to find the partition position
    static int partition(int[] data, int low, int high) {

        // choose the rightmost element as pivot
        int pivot = data[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    public void sort(int[] data, int low, int high) {

        for (int datum : data) {
            System.out.printf("%d ", datum);
        }
        System.out.println("\n");

        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(data, low, high);

            // recursive call on the left of pivot
            sort(data, low, pi - 1);

            // recursive call on the right of pivot
            sort(data, pi + 1, high);
        }

        for (int datum : data) {
            System.out.printf("%d ", datum);
        }
        System.out.println("\n");
    }
}
