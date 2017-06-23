package sort;

import java.util.Scanner;

/**
 * 输入任意一个整数，返回它的阶乘
 * Created by Administrator on 2017/6/23.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        Integer num = Integer.parseInt(scanner.next());
        System.out.println(factorial(num));
    }

    public static int factorial(int num){
        if (num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }

}
