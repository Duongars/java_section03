package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bai07 {
    //Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
//tử của mảng 1 chiều số nguyên. Nhập giá trị (addValue) và chỉ số chèn
//phần tử vào mảng (addIndex), thực hiện thêm chèn giá trị addValue và chỉ
//số addIndex của mảng
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử");
        int num = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[num];


        for (int i = 0; i < num; i++) {
            System.out.printf("nhập phần tử thứ %d: ", i + 1);
            nums[i] = Integer.parseInt(scanner.nextLine());

        }

        System.out.println(" Nhập giá trị cần chèn ");
        int addValue = Integer.parseInt(scanner.nextLine());

        System.out.println(" Nhập chỉ số chèn ");
        int addIndex = Integer.parseInt(scanner.nextLine());

        int[] numsInsert = new int[num + 1];
        int curIndex = 0;

        for (int i = 0; i < numsInsert.length; i++) {
            if (i == addIndex) {

                numsInsert[i] = addValue;

            } else {
                numsInsert[i] = nums[curIndex];
                curIndex++;
            }

        }
        System.out.println("mảng sau khi chèn là : " + Arrays.toString(numsInsert));
    }


}
