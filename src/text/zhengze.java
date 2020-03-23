package text;

public class zhengze {
    private static String x;
    private static String regex;
    private static String num;
    public static void main(String args[]){
        x = "^[0-9]*$";
        regex = "\\d+";
        num = "123";
        System.out.println(x);
        System.out.println(regex);
        System.out.println(num.matches(x));
    }
}
