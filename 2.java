public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 3, 4};
        System.out.println("Количество чётных элементов: " + countEvens(arr1));

        int[] arr2 = {2, 2, 0};
        System.out.println("Количество чётных элементов: " + countEvens(arr2));

        int[] arr3 = {1, 3, 5};
        System.out.println("Количество чётных элементов: " + countEvens(arr3));

        int[] arr4 = {1, 5, 3, 9, 2};
        System.out.println("Разница между максимальным и минимальным элементами: " + findDifference(arr4));

        int[] arr5 = {1, 0, 0, 5, 3};
        System.out.println("Есть ли два соседних элемента с нулевым значением: " + hasZeroNeighbor(arr5));
    }


    public static int countEvens(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    public static int findDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }

    public static boolean hasZeroNeighbor(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}