public class code1 {
    public static  void main(String[] args){
        int a = 13;
        System.out.println(a);
        int  len = 100;
        int sum = 0;
        for(int i =0 ;i<=len ;i++){
            if(i>10 && i< 16){
               System.out.println(i+"每一个值");
            }else{
                System.out.println("不需要====每一个值");
            }
            sum += i ;



        }
        System.out.println(sum + "总数");



    }
}
