import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String str = "He1llo Wor2ld3!";
        String[] strs = str.split("");
        List<String> list = new ArrayList();
        String tmpStr = "";
        for(String s: strs){
            if(s != null && !"".equals(s)) {
                if(!(s.toCharArray()[0]>='0' && s.toCharArray()[0]<='9')){
                    tmpStr += s;
                } else {
                    list.add(tmpStr);
                    tmpStr = "";
                }
            }
        }
        for(String s: list){
            System.out.println(s);
        }
    }
}
