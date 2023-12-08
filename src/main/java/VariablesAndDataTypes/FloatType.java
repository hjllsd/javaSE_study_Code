package VariablesAndDataTypes;

public class FloatType {
    public static void main(String[] args) {
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        // float f3 = 1.0; // 错误：不带f结尾的是double类型，不能赋值给float

        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
//     输出结果：
        System.out.println("f1"+f1);
        System.out.println("f2"+f2);
        System.out.println("d"+d);
        System.out.println("d2"+d2);
        System.out.println("d3"+d3);
    }
}
