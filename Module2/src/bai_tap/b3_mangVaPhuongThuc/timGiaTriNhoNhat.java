package bai_tap.mangVaPhuongThuc;

import java.util.Scanner;

public class timGiaTriNhoNhat {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so luong mang: ");
        size=scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
