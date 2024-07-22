public class MergeSortAlgo {
  /*  public static void DisplayArr(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void Merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        // Copy data to temp arrays left[] and right[]
        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = arr[mid + 1 + j];

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[], if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[], if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void MergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int mid = (l + r) / 2;

            // Sort first and second halves
            MergeSort(arr, l, mid);
            MergeSort(arr, mid + 1, r);

            // Merge the sorted halves
            Merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 6, 7, 1, 4 };
        int n = arr.length;
        System.out.println("Array before sorting:");
        DisplayArr(arr);
        MergeSort(arr, 0, n - 1);
        System.out.println("Array after sorting:");
        DisplayArr(arr);
    }
}*/


// correction of pw code
public static void DisplayArr(int arr[]) {
  for (int val : arr) {
        System.out.print(val + " ");
    }
        System.out.println();
}

public static void Merge(int arr[], int l, int mid, int r) {
    int n1 = mid - l + 1;
    int n2 = r - mid;

    int left[] = new int[n1];
    int right[] = new int[n2];

    for (int i = 0; i < n1; i++) left[i] = arr[l + i];  // Correct indexing here
    for (int j = 0; j < n2; j++) right[j] = arr[mid + 1 + j];  // Correct indexing here

    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
        if (left[i] <= right[j]) {
            arr[k++] = left[i++];
        } else {
            arr[k++] = right[j++];
        }
    }

    while (i < n1) {
        arr[k++] = left[i++];
    }
    while (j < n2) {
        arr[k++] = right[j++];
    }
}

public static void MergeSort(int arr[], int l, int r) {
    if (l < r) {  // Corrected condition to `if (l < r)`
        int mid = (l + r) / 2;
        MergeSort(arr, l, mid);
        MergeSort(arr, mid + 1, r);
        Merge(arr, l, mid, r);
    }
}
public static void main(String[] args) {
    int arr[] = { 5, 3, 2, 6, 7, 1, 4 };
    int n = arr.length;
    System.out.println("Array before sorting:");
    DisplayArr(arr);
    MergeSort(arr, 0, n - 1);
    System.out.println("Array after sorting:");
    DisplayArr(arr);
  }
}