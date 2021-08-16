package cn.simplezihao.jedis.test;


import cn.simplezihao.jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * jedis快速入门
 * */
public class JedisTest {

    @Test
    public void test1() {
        // 1. 获取连接
        Jedis jedis = new Jedis("localhost", 6379);
        // 2. 操作
        jedis.set("username", "zhangsan");
        // 3. 关闭连接
        jedis.close();
    }

    /*
     * string数据结构操作
     * */
    @Test
    public void test2() {
        //1.获取连接
        Jedis jedis = new Jedis(); // 如果使用空参构造，默认值localhost,6379端口
        //2.操作
        //存储
        jedis.set("username", "zhangsan");
        //获取
        String username = jedis.get("username");
        System.out.println(username);

        // 可以使用setex()方法存储可以指定过期时间的key value
        // 将activatecode:hehe键值对存入redis,并且20s后自动删除该键值对
        jedis.setex("activatecode", 20, "hello");

        //3.关闭连接
        jedis.close();
    }


    /*
     * hash数据结构操作
     * */
    @Test
    public void test3() {
        //1.获取连接
        Jedis jedis = new Jedis(); // 如果使用空参构造，默认值localhost,6379端口
        //2.操作
        //存储
        jedis.hset("user", "name", "lisi");
        jedis.hset("user", "age", "23");
        jedis.hset("user", "gender", "female");
        //获取hash
        String name = jedis.hget("user", "name");
        System.out.println(name);

        // 获取hash的所有map中的数据
        Map<String, String> user = jedis.hgetAll("user");

        // keyset
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            // 获取value
            String value = user.get(key);
            System.out.println(key + ":" + value);
        }


        //3.关闭连接
        jedis.close();
    }


    /*
     * list数据结构操作
     * */
    @Test
    public void test4() {
        //1.获取连接
        Jedis jedis = new Jedis(); // 如果使用空参构造，默认值localhost,6379端口
        //2.操作
        //list存储
        jedis.lpush("mylist", "a", "b", "c"); // 左边存
        jedis.rpush("mylist", "a", "b", "c"); // 右边存

        // list范围获取
        List<String> mylist1 = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist1);

        // list弹出
        String element1 = jedis.lpop("mylist"); //c
        System.out.println(element1);

        String element2 = jedis.rpop("mylist"); //c
        System.out.println(element2);


        // list范围获取
        List<String> mylist2 = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist2);

        //3.关闭连接
        jedis.close();
    }


    /*
     * set数据结构操作
     * */
    @Test
    public void test5() {
        //1.获取连接
        Jedis jedis = new Jedis(); // 如果使用空参构造，默认值localhost,6379端口
        //2.操作
        //set存储
        jedis.sadd("myset", "java", "python", "c++");


        // set获取
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);


        //3.关闭连接
        jedis.close();
    }


    /*
     * sortedset数据结构操作
     * */
    @Test
    public void test6() {
        //1.获取连接
        Jedis jedis = new Jedis(); // 如果使用空参构造，默认值localhost,6379端口
        //2.操作
        //sortedset存储
        jedis.zadd("mysds", 9, "zs");
        jedis.zadd("mysds", 3, "ls");
        jedis.zadd("mysds", 6, "ys");


        // sortedset获取
        Set<String> mysortedset = jedis.zrange("mysds", 0, -1);
        System.out.println(mysortedset);


        //3.关闭连接
        jedis.close();
    }


    /*
     * jedis连接池使用
     * */
    @Test
    public void test7() {
        //0.创建一个配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);

        //1.创建Jedis连接池对象
        JedisPool jedisPool = new JedisPool(config, "localhost", 6379);
        //2.获取连接
        Jedis jedis = jedisPool.getResource();
        //3.使用
        jedis.set("hello", "world");
        //4.关闭，归还到连接池中
        jedis.close();
    }


    /*
     * jedis连接池工具类使用
     * */
    @Test
    public void test8() {
        //通过连接池工具类获取
        Jedis jedis = JedisPoolUtils.getJedis();

        // 使用
        jedis.set("hello", "world");

        // 关闭
        jedis.close();
    }

}
