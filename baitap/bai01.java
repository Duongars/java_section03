package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bai01 {
//    : Khai báo mảng số nguyên gồm 5 phần tử, nhập giá trị các phần
//tử từ bàn phím và in ra giá trị các phần tử của mảng
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("nhập số phần tử");
    int num = Integer.parseInt(scanner.nextLine());
    int[] nums = new int[num];



    for (int i = 0; i < num; i++) {
        System.out.printf("nhập phần tử thứ %d: ", i + 1);
        nums[i] = Integer.parseInt(scanner.nextLine());

    }

    System.out.println("mảng bạn vừa nhập là : "+ Arrays.toString(nums));

}

}
