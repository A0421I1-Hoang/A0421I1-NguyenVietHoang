package bai_tap.mangVaPhuongThuc;

public class gopMang {
    public static void main(String[] args) {
        int [] a= {1,2,3,4,5};
        int [] b= {6,7,8,9,10,12,4,5,8,4,69};
        int t=a.length+b.length;
        int [] c= new int[t];
        for (int i=0;i<t;i++){
            if (i>=a.length){
                c[i]=b[i-a.length];
            }else {
                c[i]=a[i];
            }
        }
        for (int j=0;j<c.length;j++) {
            System.out.println(c[j]+" ");
        }
    }
}
