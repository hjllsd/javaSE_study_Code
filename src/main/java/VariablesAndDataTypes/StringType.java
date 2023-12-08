package VariablesAndDataTypes;

public class StringType {
    public static void main(String[] args) {
        // Java的字符串是Unicode编码，每个字符占用2个字节，因此，Java的字符串无论是英文还是中文都能正确显示。
        // 字符串是引用类型，我们用双引号"..."表示字符串。引用类型比较，要始终使用equals()方法，而不是使用==。
        // Java的字符串除了是一个引用类型外，还有个重要特点，就是字符串不可变。
        // 例如，对于如下代码：
        String s = "hello";
        System.out.println(s);
        s = "world";
        System.out.println(s);
        // 实际上，这个代码是没问题的，但是，我们要注意到字符串"hello"并没有改变，只是变量s从指向"hello"变成了指向"world"，而字符串"hello"还在那里，仍然没有改变！
        // 如果我们定义一个字符串变量：
        String s1 = "hello";
        String s2 = "hello";
        // 我们会发现，s1和s2是一样的。因此，对于字符串，编译器在编译期就可以确定它的值，而对于其他类型的变量，则只能在运行期才能确定。
        // 这种在编译期就能确定值的变量，称为编译期常量（Compile-time Constant）。编译期常量用final修饰符修饰，表示这个变量一旦初始化后，就不可改变了。
        // 除了使用双引号"..."表示字符串外，还可以用多行字符串表示：
        String s3 = "First line\nSecond line\nThird line";
        System.out.println(s3);
        // 还可以用"""..."""表示多行字符串：
        String s4 = """
                SELECT * FROM
                users
                WHERE id > 100
                ORDER BY name DESC
                """;
        System.out.println(s4);
        final String s5 = "hello";
        // s5 = "world"; // error: cannot assign a value to final variable s5
        System.out.println(s5);
        // 这种多行字符串用起来比较方便，但是编译器实际上会把它们转换成普通字符串，因此，多行字符串也不是编译期常量。
    }
}
