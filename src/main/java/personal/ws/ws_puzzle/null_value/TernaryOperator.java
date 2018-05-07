package personal.ws.ws_puzzle.null_value;

/**
 * @description：条件运算符会做数值类型的类型提升
 * @modifier：
 * @modifydate：
 * @author：Sean Wang
 * @createdate：2018年05月07日
 * @version：V1.0
 */
public class TernaryOperator {

    public static void main(String[] args) {
        Integer i = new Integer(1);
        if (i.equals(1))
            i = null;
        Double d = new Double(2.0);
        // NullPointerException!
        Object o = true ? i : d;
        System.out.println(o);
    }
}
