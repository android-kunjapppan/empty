import java.util.Scanner;

class sls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(shortLongShort(str1, str2));
    }

    static String shortLongShort(String a, String b) {
        int l1 = a.length(), l2 = b.length();

        if(l1 < l2)
            return a + b + a;
        else
            return b + a + b;
    }
}