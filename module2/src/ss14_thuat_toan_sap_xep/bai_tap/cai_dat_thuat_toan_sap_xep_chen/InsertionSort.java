package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void insertionSort (int[] array) {
        int insertionIndex;
        int tempValue;
        for (int i = 1; i < array.length; i++) {
            tempValue = array[i];
            insertionIndex = i;
            while (insertionIndex > 0 && tempValue < array[insertionIndex - 1]) {
                array[insertionIndex] = array[insertionIndex - 1];
                insertionIndex--;
            }
            array[insertionIndex] = tempValue;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.print("Mảng sau khi sắp xếp chèn là: ");
        for (int i : list) {
            System.out.print(i + "\t");
        }
    }
}
