package ch09;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 8, 5, 3, 5, 6, 8, 2, 3};

        // 1. arr의 모든 요소를 출력하세요.
        for (int num : arr) {
            System.out.print(num + "\t");
        }

        System.out.println();

        // 2. arr2와 arr3, arr2와 arr4의 모든 요소가 같은 값을 가지고 있는 지 출력하세요. (순서와 값이 모두 일치)
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1, 3};
        int[] arr4 = {1, 2, 3};

        boolean arr3Flag = true, arr4Flag = true;

        for (int i=0; i < arr2.length; i++) {
            if (arr2[i] != arr3[i]) arr3Flag = false;
            if (arr2[i] != arr4[i]) arr4Flag = false;
            if (arr3Flag == false && arr4Flag == false) break;
        }

        if (arr3Flag == true) System.out.println("arr2, arr3 같음");
        else System.out.println("arr2, arr3 다름");

        if (arr4Flag == true) System.out.println("arr2, arr4 같음");
        else System.out.println("arr2, arr4 다름");

        // 3. arr 요소의 최소값과 최대값을 구하세요.
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);

        // 4. arr의 요소를 오름차순으로 정렬하세요.
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + "\t");
        }

    }
}
