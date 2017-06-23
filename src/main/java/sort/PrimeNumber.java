package sort;

import java.util.Scanner;

/**
 * 判断任意一个整数是否素数
 * Created by Administrator on 2017/6/23.
 */
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        Integer num = Integer.parseInt(scanner.next());
        boolean result = false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i != 0) {
               result = true;
            }
        }
       if (result == true) {
           System.out.println(num + "是素数");
       } else {
           System.out.println(num + "不是素数");
       }

    }

}
