package junit;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

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
}
