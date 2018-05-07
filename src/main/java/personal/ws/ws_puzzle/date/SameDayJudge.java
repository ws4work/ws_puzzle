package personal.ws.ws_puzzle.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**************************
 * 方法功能说明：判断是否同一天
 * 创建：2018/1/3 by WangShang
 * 修改：2018/1/3 by WangShang
 * 结果：用 时间戳除以一天的毫秒数判断 性能优于用 日期格式化处理的字符串判断
 * 原因：日期格式化生成的字符串消耗了性能
 ***************************/
public class SameDayJudge {

    public static Date day1 = new Date(2018, 1, 3, 10, 50, 10);
    public static Date day2 = new Date(2018, 1, 3, 9, 20, 0);
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public static int test_num = 1000000;

    public static void main(String[] args) {
        simpleFormat();
        caculate();
    }

    private static void simpleFormat() {
        System.out.println("simpleFormat:");
        long begin = System.currentTimeMillis();
        System.out.println("begin:" + begin);
        for (int i = 0; i < test_num; i++) {
            String ds1 = sdf.format(day1);
            String ds2 = sdf.format(day2);
            if (ds1.equals(ds2)) {
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("end:" + end);
        System.out.println("use:" + (end - begin));
    }

    private static void caculate() {
        System.out.println("caculate:");
        long begin = System.currentTimeMillis();
        System.out.println("begin:" + begin);
        int aday = 24 * 60 * 60;
        for (int i = 0; i < test_num; i++) {
            if (day1.getTime() / aday == day2.getTime() / aday) {
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("end:" + end);
        System.out.println("use:" + (end - begin));
    }

}
