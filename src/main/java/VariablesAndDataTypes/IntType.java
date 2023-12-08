package VariablesAndDataTypes;

public class IntType {
    public static void main(String[] args) {
        // 对于整型类型，Java只定义了带符号的整型，因此，最高位的bit表示符号位（0表示正数，1表示负数）。各种整型能表示的最大范围如下：
        // byte：-128 ~ 127
        // short: -32768 ~ 32767
        // int: -2147483648 ~ 2147483647
        // long: -9223372036854775808 ~ 9223372036854775807
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512

        long n1 = 9000000000000000000L; // long型的结尾需要加L
        long n2 = 900; // 没有加L，此处900为int，但int类型可以赋值给long
        // int i6 = 900L; // 错误：不能把long型赋值给int
    //     输出结果：
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println("long");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println("long");
    }
}
