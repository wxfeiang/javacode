public class forBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            String line = "";
            for (int j = 1; j <= 9; j++) {
                if (j > i) {
                    break;
                }
                line += i + "*" + j + "=" + (i * j) + "\t";
            }
            System.out.println(line);
            int a = 100;
            a++;
            System.out.println(a);

        }



    }
}
