package personal.ws.ws_puzzle.null_value;

/************************** 
 * 方法功能说明：
 * 创建：2018/1/2 by WangShang
 * 修改：2018/1/2 by WangShang
 * 修改内容： 
 ***************************/
public class Null2String {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s);
        //StringBuilder.append函数:如果判断对象为 null，就会调用appendNull，填充”null”
        String s2 = null;
        s2 = s2 + "!";
        System.out.println(s2);
        System.out.println("s+'':"+s+"");
        System.out.println("s1:"+(s instanceof String));
        System.out.println("s2:"+((s+"") instanceof String));
        String a="";
        System.out.println("a+'':"+a+"");
        System.out.println("a1:"+(a instanceof String));
        System.out.println("a2:"+((a+"") instanceof String));
        StringBuilder sb = new StringBuilder();
        sb.append(s2);
        System.out.println("sb:"+sb.toString());
    }
}
