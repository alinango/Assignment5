package Excercise2_Arrays;

import java.util.Scanner;

public class Baitap1 {

    //a.Hien thi tat ca cac gia tri
    public static void hienThiMang(int[] arrays) {
        System.out.print("Cac phan tu trong mang: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }

    //b.Dao nguoc mang
    public static void daoNguocMang(int[] arrays) {
        for (int i = 0; i < arrays.length / 2; i++) {
            int temp = arrays[i];
            arrays[i] = arrays[arrays.length - 1 - i];
            arrays[arrays.length - 1 - i] = temp;
        }
        System.out.print("Mang sau khi dao nguoc: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }

    //c.Hien thi cac so chan
    public static void hienThiSoChan(int[] arrays) {
        System.out.print("Cac so chan trong mang: ");
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                System.out.print(arrays[i] + " ");
            }
        }
        System.out.println();
    }

    //d.Tong cac phan tu chia het cho 3 va 5
    public static int tongChiaHet3Va5(int[] arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 3 == 0 && arrays[i] % 5 == 0) {
                sum += arrays[i];
            }
        }
        return sum;
    }

    //e.Sap xep mang tang dan
    public static void sapXepTangDan(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        System.out.print("Mang sau khi sap xep tang dan: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }

    //f.Sap xep mang giam dan
    public static void sapXepGiamDan(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] < arrays[j]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        System.out.print("Mang sau khi sap xep giam dan: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arrays = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "]= ");
            arrays[i] = scanner.nextInt();
        }
        hienThiMang(arrays);
        daoNguocMang(arrays);
        hienThiSoChan(arrays);
        int sum = tongChiaHet3Va5(arrays);
        System.out.println("Tong cac phan tu chia het cho 3 va 5: " + sum);
        sapXepTangDan(arrays);
        sapXepGiamDan(arrays);
    }
}
