package sort;

/**
 * 九九乘法表
 * Created by Administrator on 2017/6/23.
 */
public class NineNineMulitTable {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
                if(i == j){
                    System.out.println();
                }

            }
        }
    }

}
