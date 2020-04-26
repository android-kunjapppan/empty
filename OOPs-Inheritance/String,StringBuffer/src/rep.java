import java.util.*;

class rep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = in.nextInt();
        System.out.println(nlastRepeat(str, n));
    }

    static String nlastRepeat(String s, int n) {
        String r = s.substring(s.length()-n);
        String big = "";
        for(int i=0;i<n; i++) {
            big += r;
        }
        return big;
    }
}