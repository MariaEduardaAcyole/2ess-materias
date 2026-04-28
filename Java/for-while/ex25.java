
public class ex25 {
    public static void main(String[] args) {

        int a = -1 , b,c,f;
        b = 0;
        c = 1;

        for (int i = 1; i <= 20; i++) {
            f = a + b + c;
            System.out.print("  "+ f);
            a = b;
            b = c;
            c = f;
        }
    }
}

