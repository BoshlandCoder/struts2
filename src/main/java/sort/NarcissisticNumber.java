package sort;

/**
 *  101-999 水仙花数
 *
 * Created by Administrator on 2017/6/24.
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 1000; i++) {
            if (narcissisticNumber(i) == true){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("总数:"+count);
    }

    public static boolean narcissisticNumber(int n) {
        int h = n / 100;
        int t = (n % 100)/10;
        int u = n-h*100-t*10;
        if (n == t*t*t+h*h*h+u*u*u) {
            return true;
        }else {
            return false;
        }
    }

}
