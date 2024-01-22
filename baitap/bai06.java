package baitap;

import java.util.Scanner;

public class bai06 {

//Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
//tử của mảng 1 chiều số nguyên. Nhập vào một giá trị (findNumber), in ra
//chỉ số các phần tử và tổng các phần tử có giá trị bằng giá trị findNumber


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử");
        int num = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[num];


        for (int i = 0; i < num; i++) {
            System.out.printf("nhập phần tử thứ %d: ", i + 1);
            nums[i] = Integer.parseInt(scanner.nextLine());

        }

        System.out.println(" Nhập giá trị cần tìm ");
        int findValue = Integer.parseInt(scanner.nextLine());

        boolean check = false;
        for (int i = 0; i < num; i++) {
            if (nums[i] == findValue) {
                System.out.printf("%d\t",i);
                check = true;
            }

        }

        if (!check) {
            System.out.println("không có giá trị cần tìm");
        }

    }

}
