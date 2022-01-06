public class MergeSort {
    public static void main(String[] args) {
        int[] data = new int[]{5, 4, 3, 2, 1};
        mergeSort(data, 0, data.length - 1);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void mergeSort(int[] data, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end) {
        // build a temp array to avoid modifying the original array
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0; // iterator for temp array
        // while both sub-array have values then try and merge them in sorted order
        while(i <= mid && j <= end) {
            if(data[i] <= data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }
        while(i <= mid) {
            temp[k++] = data[i++];
        }
        while(j <= end) {
            temp[k++] = data[j++];
        }
        for(int l = start; l<=end; l++) {
            data[l] = temp[l-start];
        }
    }
}