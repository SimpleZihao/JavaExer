package CompareDemo;

import com.oracle.deploy.update.UpdateCheck;

public class Person {
    private String name;
    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*
     * 比较年龄大小的方法
     * */

//    @Override
//    public String toStirng() {
//        return "Person [name=" + name + ", age=" + age + "]";
//    }




}
