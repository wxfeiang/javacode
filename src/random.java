import  java.util.Scanner;
import java.util.Random;

public class random {
    public static void  main(String args[]){
        Random rd = new Random();
        int temp = rd.nextInt( 100);
        System.out.println("随机数 " + temp);

        // 创建用户输入的数据
        Scanner in = new Scanner(System.in);
        System.out.println("请输入内容 ");
        String str  = in.nextLine();
        int aa = in.nextInt();
        System.out.println("当前内容 "+str + aa);
    }
}
