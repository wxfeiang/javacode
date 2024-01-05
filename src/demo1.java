
 import  java.util.Scanner;

public class demo1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); //  数理化输入
        //  *(y-x) + x
        int start  =  0;
        int end = 100;
        boolean status =  true;
        int  frequency = 1;

        while (status){
            // 生成随机数区间范围
            int currentNum =   (int) (Math.random() * (end - start) + start) ;
            System.out.println("当前随机数:" + currentNum);
            System.out.println("请输入你的数字： ");
            int keys = in.nextInt();
            if(keys<currentNum){
                System.out.println( status);
            }else {
                break;
            }


        }

    }
}
