package b11_Stack_Queue.demSoLanXuatHienCuaMotTuTrongChuoiBangMap;

import java.lang.String;
import java.util.Map;
import java.util.Scanner;

import static b11_Stack_Queue.demSoLanXuatHienCuaMotTuTrongChuoiBangMap.DemSoLan.countWords;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban hay nhap chuoi bat ki: ");
        System.out.println("---------------------------------");
        str = sc.nextLine();
        System.out.println("---------------------------------");
        System.out.println("Liệt kê số lần xuất hiện của các từ: ");
        Map<String, Integer> wordMap = countWords(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }
    }
}
