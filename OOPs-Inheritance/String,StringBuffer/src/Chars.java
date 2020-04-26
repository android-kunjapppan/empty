import java.util.*;

class Chars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.print(mergeStrings(a, b));
    }

    static String mergeStrings(String a, String b) {
        String bigger = "";
        int l1 = a.length(), l2 = b.length(), l = (l1 < l2)? l1 : l2, i;
        for(i = 0; i < l; i++) {
            bigger += a.charAt(i);
            bigger += b.charAt(i);
        }
        while(i <l1) {
            bigger += a.charAt(i);
            i++;
        }
        while(i <l2) {
            bigger += b.charAt(i);
            i++;
        }
        return bigger;
    }
}