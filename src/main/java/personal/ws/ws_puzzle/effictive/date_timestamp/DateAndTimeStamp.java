package personal.ws.ws_puzzle.effictive.date_timestamp;

import java.util.Date;

/**************************
 * 说明：new Date().getTime()和System.currentTimeMillis()效率问题
 * 创建：2018/1/2 by WangShang
 * 修改：2018/1/2 by WangShang
 * 结果：new Date()的实质是通过System.currentTimeMillis生成的时间,O(new Date)>O(System.currentTimeMillis()
 ***************************/
public class DateAndTimeStamp {
    public static void main(String[] args) {
        int times = 1000000000;
        long date_start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            new Date().getTime();
        }
        long date_end = System.currentTimeMillis();
        System.out.println(date_start);
        System.out.println(date_end);
        System.out.println("date_timestamp:" + (date_end - date_start));

        long sys_start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            System.currentTimeMillis();
        }
        long sys_end = System.currentTimeMillis();
        System.out.println(sys_start);
        System.out.println(sys_end);
        System.out.println("sys:" + (sys_end - sys_start));
    }
}
