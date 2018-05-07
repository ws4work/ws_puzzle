package personal.ws.ws_puzzle.map_array;

import java.lang.reflect.Array;
import java.util.*;

/**************************
 * 方法功能说明：
 * 创建：2018/1/29 by WangShang
 * 修改：2018/1/29 by WangShang
 * 修改内容： 
 ***************************/
public class MapValue2Array {
    public static void main(String[] args) {
        Map<String,Object> map =new HashMap<>();
        ArrayList list = new ArrayList();
        list.add("789");
        map.put("a", list);
        HashMap<String, Object> valueMap = new HashMap<>();
        valueMap.put("111","111");
        map.put("b", valueMap);
        map.put("c",new String[]{"1","2","3"});

        Object a = map.get("a");
        System.out.println("a:"+a);
        System.out.println("a:"+((List)a).toString());
        Object b = map.get("b");
        System.out.println("b:"+b);
        System.out.println("b:"+((Map)b).toString());
        String[] c = (String[]) map.get("c");
        System.out.println("c:"+c);
        Arrays.stream(c).forEach(System.out::println);
    }
}
