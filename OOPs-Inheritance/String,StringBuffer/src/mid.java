import java.util.Scanner;

class mid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(trimFirstLast(str));
    }

    static String trimFirstLast(String s) {
        return s.substring(1, s.length()-1);
    }
}