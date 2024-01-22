package baitap;

import java.util.Scanner;

public class bai04 {

//Nhập số phần tử và giá trị các phần tử của mảng một chiều số
//nguyên. Tìm giá trị lớn nhất và nhỏ nhất trong mảng


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử");
        int num = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[num];

        int max =- 2147483648, min=2147483647 ;

        for (int i = 0; i < num; i++) {
            System.out.printf("nhập phần tử thứ %d: ", i + 1);
            nums[i] = Integer.parseInt(scanner.nextLine());
            if (min>nums[i]){
                min = nums[i];
            }
            if (max<nums[i]){
                max = nums[i];
            }

        }

        System.out.println("phần tử lớn nhất là "+ max);
        System.out.println("phần tử nhỏ nhất là "+ min);

    }
}
