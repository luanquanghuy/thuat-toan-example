package baitoanlietke;

import java.util.Scanner;

public class SinhDayNhiPhan {
    private static int n;
    private static byte[] arr;
    private static int soCauHinh = 0;

    public static void main(String[] args) {
        System.out.println("nhap n:");
        n = new Scanner(System.in).nextInt();
        arr = new byte[n];
        inMang();
        int i = n - 1;
        while (i >= 0) {
            if (arr[i] == 0) {
                arr[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    arr[j] = 0;
                }

                inMang();

                i = n - 1;
            } else {
                i--;
            }
        }

        System.out.println("Tong so cau hinh: " + soCauHinh);

    }

    private static void inMang() {
        System.out.println("Cau hinh thu " + soCauHinh);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        soCauHinh++;
        System.out.println();
    }
}
