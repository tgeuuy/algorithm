package test;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {312, 4321, 42, 5324, 5, 46, 5436};

        for (int i = 0; i < arr.length; i++) {
          int index = i;
            for (int j = i; j < arr.length ; j++) {
                if(arr[index]> arr[j]) index = j;
            }
            if(i == index) continue;
            arr[i] = arr[i] ^ arr[index];
            arr[index] = arr[i] ^ arr[index];
            arr[i] = arr[i] ^ arr[index];
            for (int v : arr) System.out.print(v + " ");
            System.out.println();
        }
        for (int v : arr) System.out.print(v + " ");
    }
}
