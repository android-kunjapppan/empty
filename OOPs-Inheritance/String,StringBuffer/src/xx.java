import java.util.Scanner;

class xx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(removeX(str));
    }

    static String removeX(String s) {
        int l = s.length();
        if (s.charAt(0) == 'x' && s.charAt(l-1) == 'x')
            return s.substring(1, l-1);
        else if (s.charAt(0) == 'x')
            return s.substring(1);
        else if(s.charAt(l-1) == 'x')
            return s.substring(0, l-1);
        else
            return s;
    }
}