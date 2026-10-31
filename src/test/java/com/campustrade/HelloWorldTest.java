package com.campustrade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 第一个单元测试，验证 Maven 的测试链路是否正常。
 */
class HelloWorldTest {

    @Test
    void greetShouldContainName() {
        String message = HelloWorld.greet("测试");

        assertTrue(message.startsWith("Hello"), "问候语应以 Hello 开头");
        assertTrue(message.contains("测试"), "问候语应包含传入的名字");
    }
}
