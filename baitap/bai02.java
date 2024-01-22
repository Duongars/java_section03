package baitap;

import java.util.Scanner;

public class bai02 {

//    Nhập vào số phần tử (n) của mảng 1 chiều, khai báo và nhập giá
//trị các phần tử của mảng một chiều số thực gồm n phần tử. In ra giá trị
//trung bình cộng của các phần tử trong mảng

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử");
        int num = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[num];
        int sum =0;

        for (int i = 0; i < num; i++) {
            System.out.printf("nhập phần tử thứ %d: ", i + 1);
            nums[i] = Integer.parseInt(scanner.nextLine());
            sum+= nums[i];

        }

        float average = sum/num;

        System.out.printf("giá trị trung bình cộng là: %f ",average);




    }
}
