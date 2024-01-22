package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bai09 {

//     Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
//tử của mảng 1 chiều số nguyên. Nhập chỉ số phần tử cần xóa (deleteIndex)
//và thực hiện xóa phần tử trong mảng theo deleteIndex

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử");
        int num = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[num];
        int[] deleteArr = new int[num-1];
        int curIndex = 0;

        for (int i = 0; i < num; i++) {
            System.out.printf("nhập phần tử thứ %d: ", i + 1);
            nums[i] = Integer.parseInt(scanner.nextLine());

        }

        System.out.println(" Nhập chỉ số phần tử cần xóa ");
        int deleteIndex = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nums.length; i++) {
            if (i != deleteIndex) {
                deleteArr[curIndex]=nums[i];
                curIndex++;
            }

        }

        System.out.println(Arrays.toString(deleteArr));

    }
}
