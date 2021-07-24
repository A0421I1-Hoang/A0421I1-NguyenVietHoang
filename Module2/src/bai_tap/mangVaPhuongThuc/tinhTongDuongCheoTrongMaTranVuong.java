package bai_tap.mangVaPhuongThuc;

public class tinhTongDuongCheoTrongMaTranVuong {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("Tong cua duong cheo la "+sum);
    }
}
