import java.io.File;

public class FileTest {

    public static void main(String[] args) {
        /*
        需求：列出当前目录下子目录中所有的内容
        问题分析：
        1. 在遍历当前目录时，会获取到当前所有的文件以及文件夹
        2. 要遍历子目录需要对获取到的当前的file对象进行判断，只有是目录才可以作为子目录进行继续遍历
        * */

        File dir = new File("D:\\Java\\source_code");

        listAll(dir);

    }

    private static void listAll(File dir) {  // dir用于接收目录以及子目录

        System.out.println("dir: " + dir.getName());
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                // 如果遍历到当前的file对象是个目录，则继续进行遍历
                listAll(file); // 递归
            } else {
                System.out.println("file: " + file.getName());
            }
        }
    }


}
