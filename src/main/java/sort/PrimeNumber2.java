package sort;

/**
 *
 *判断101-200之间有多少个素数，并输出所有素数
 *
 * Created by Administrator on 2017/6/24.
 */
public class PrimeNumber2 {
    public static void main(String[] args) {
        PrimeNumber2 primeNumber2 = new PrimeNumber2();
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean b = primeNumber2.primeNumber(i);
            if (b == true) {
                count++;
                System.out.println(i);
            }
        }

        System.out.println("总数为："+count);
    }

    public boolean primeNumber(int i){
        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
