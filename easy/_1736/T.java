package _1736;

public class T {
    public static void main(String[] args) {
        System.out.println(maximumTime("?9:?8"));
    }

    public static String maximumTime(String time) {
        char[] cs = time.toCharArray();
        if (cs[0] == '?') {
            // if(cs[1]=='4')
            if (cs[1] > '3' && cs[1] <= '9') {
                cs[0] = '1';
            } else {
                cs[0] = '2';
            }
        }
        if (cs[1] == '?') {
            if (cs[0] == '2' || cs[0] == '?') {
                cs[1] = '3';
            } else {
                cs[1] = '9';
            }
        }
        if (cs[3] == '?') {
            cs[3] = '5';
        }
        if (cs[4] == '?') {
            cs[4] = '9';
        }
        return new String(cs);
    }
}
