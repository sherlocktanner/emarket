import java.util.regex.Pattern;

public class BitArithmetic {
    public static final int CASE_INSENSITIVE = 0x02;
    public static final int COMMENTS = 0x04;
    private static final int ALL_FLAGS = CASE_INSENSITIVE | COMMENTS;

    public static void main(String[] args) {
        int x = ~0x02;
        // 1.正数的补码是它本身
        System.out.println("1的补码：" + Integer.toBinaryString(1));
        // 2.负数的补码是它的反码+1（-1后取反码）
        System.out.println("-1的补码：" + Integer.toBinaryString(-1));
        // 3.非~
        System.out.println("2做非运算：" + x);
        // 4.与&
        System.out.println("-3做与运算"  + (x & x));
        // 5.或|
        System.out.println("2 | 4 = " + ALL_FLAGS);
        System.out.println("~(2 | 4) = " + ~ALL_FLAGS);
        System.out.println("-3 & ~(2 | 4) = " + (x & ~ALL_FLAGS));
        if ((0 & ~ALL_FLAGS) != 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
