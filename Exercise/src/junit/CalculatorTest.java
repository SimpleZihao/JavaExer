package junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /*
     * 初始化方法：用于资源申请，所有测试方法在执行之前都会先执行该方法
     * */
    @Before
    public void init() {
        System.out.println("init正在执行...");
    }

    /*
     * 释放资源方法：在所有测试方法执行完后，自动执行此方法
     * */
    @After
    public void close() {
        System.out.println("close正在执行...");
    }


    // 测试add方法
    @Test
    public void testAdd() {
        // 1.创建计算器对象
        Calculator c = new Calculator();
        // 2.调用add方法
        int result = c.add(1, 3);
        // 3.断言
        Assert.assertEquals(4, result);
    }

    // 测试sub方法
    @Test
    public void testSub() {
        // 1.创建计算器对象
        Calculator c = new Calculator();
        // 2.调用sub方法
        int result = c.sub(3, 2);
        // 3.断言
        Assert.assertEquals(1, result);
    }
}
