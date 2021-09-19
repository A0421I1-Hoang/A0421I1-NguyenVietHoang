package b14_ThuatToanSapXep.CaiDatSapXepChen;

public class InsertionSort {

    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSortByStep(list);
        System.out.println("\n");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
