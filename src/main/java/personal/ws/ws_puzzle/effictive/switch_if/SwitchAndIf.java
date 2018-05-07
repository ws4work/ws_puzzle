package personal.ws.ws_puzzle.effictive.switch_if;

import java.util.Random;
import java.util.stream.IntStream;

/**************************
 * 方法功能说明：验证switch和if的效率问题
 * 创建：2018/1/22 by WangShang
 * 修改：2018/1/22 by WangShang
 * 内容： 如果n=3,则期望的跳转次数为1，刚好与switch...case相同。
 *             由此，如果选择分支大于3的时候，选用switch...case结构效率会更高一些，
 *             而小于3时，选用if...else结构更好。
 ***************************/
public class SwitchAndIf {

    public static void main(String[] args) {
        Random random = new Random();
        IntStream ints = random.ints(100000000L, 0, 6);
        int[] array = ints.toArray();
        switchOper(array);
        System.gc();
        ifOper(array);
    }

    public static void switchOper(int[] array) {
        System.out.println("------------------switch:");
        long start = System.currentTimeMillis();
        System.out.println("start:" + start);
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("end:" + end);
        System.out.println("start-end:" + (end - start));
    }

    public static void ifOper(int[] array) {
        System.out.println("------------------if:");
        long start = System.currentTimeMillis();
        System.out.println("start:" + start);
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (0 == value) {
            } else if (1 == value) {
            } else if (2 == value) {
            } else if (3 == value) {
            } else if (4 == value) {
            } else if (5 == value) {
            } else {
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("end:" + end);
        System.out.println("start-end:" + (end - start));
    }
}
