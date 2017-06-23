package sort;

/**
 * Created by Administrator on 2017/6/23.
 */
public class Fibo {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo(i)+"\t");
            sum += fibo(i);
        }


    }

    public static int fibo(int num){
        if(num == 1){
            return 1;
        }
        if (num == 2){
            return 1;
        }
        return fibo(num-1) + fibo(num-2);

    }

}
