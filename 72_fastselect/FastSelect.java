/* 
 * William Vongphanith
 * APCS1 pd6
 * HW72 -- Faster Than the Speed of Light
 * 2022-03-08
 * Time Spent: 0.5 hrs
 */

public class FastSelect {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 50000, 6, 7, 8, 9, 10};
        int k = 3;
        System.out.println(select(arr, k));
    }

    public static int select(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int pivot = partition(arr, left, right);
            if (pivot == k) {
                return arr[pivot];
            } else if (pivot < k) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return -1;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right + 1;
        while (true) {
            while (arr[++i] < pivot) {
                if (i == right) {
                    break;
                }
            }
            while (arr[--j] > pivot) {
                if (j == left) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, left, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
