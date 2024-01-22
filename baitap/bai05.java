package baitap;

import java.util.Scanner;

public class bai05 {

//: Nhập số phần tử của mảng số thực 2 chiều (row*col), khai báo và
//nhập giá trị các phần tử mảng 2 chiều số thực (row*col), in ra gia tri các
//phần tử có giá trị chẵn và tính tổng các phần tử đ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số hàng");
        int row = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số cột");
        int col = Integer.parseInt(scanner.nextLine());


        float[][] nums = new float[row][col];
        float sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                nums[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%f\t", nums[i][j]);
            }
            System.out.printf("\n");
        }


        System.out.println("in phần tử chẵn \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (nums[i][j]%2 == 0) {
                    System.out.printf("%f\t", nums[i][j]);
                    sum+=nums[i][j];
                }

            }


        }
        System.out.println("in tổng phần tử chẵn \n" +sum);

    }
}
