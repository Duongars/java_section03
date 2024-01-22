package baitap;

import java.util.Scanner;

public class bai03 {

//: Nhập vào số dòng và cột của mảng 2 chiều (row * col), khai báo và
//nhập giá trị các phần tử mảng số nguyên 2 chiều. In giá trị các phần tử
//mảng theo ma trận

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số hàng");
        int row = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số cột");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] nums = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                nums[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d\t", nums[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
