package personal.ws.ws_puzzle.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**************************
 * 方法功能说明：
 * 创建：2018/1/30 by WangShang
 * 修改：2018/1/30 by WangShang
 * 修改内容： 
 ***************************/
public class DateCompareNull {
    public static void main(String[] args) {
        Date date = new Date();
        Date anotherDate = null;
        int i = date.compareTo(anotherDate);
        System.out.println(i);


    }
}
