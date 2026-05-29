package ch10;

public class ArrayCopyMethod {
    void printArr(int[] arr, String name) {
        System.out.print(name + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void main(String[] args) {
        int[] original = {10, 20, 30};
        printArr(original, "CWI");
    }
}
