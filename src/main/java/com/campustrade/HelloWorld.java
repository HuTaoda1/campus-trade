package com.campustrade;

/**
 * 第一个程序：验证开发环境是否正常。
 *
 * <p>运行方式（在 campus-trade 目录下）：
 * <pre>
 *   mvn -q exec:java
 * </pre>
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(greet("校园二手交易平台"));
        System.out.println("Java 版本: " + System.getProperty("java.version"));
        System.out.println("JDK 安装路径: " + System.getProperty("java.home"));
    }

    /**
     * 返回一句问候语。抽成独立方法，方便写单元测试。
     */
    public static String greet(String name) {
        return "Hello, " + name + "! 环境搭建成功。";
    }
}
