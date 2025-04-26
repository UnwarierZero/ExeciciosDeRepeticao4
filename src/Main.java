public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c;
        int d;

        int i = 0;
        while (i<10){
            i = i + 2;
            System.out.print( b+ ", " + a + ", ");
            c = a;
            d = b;
            b = c + d;
            a = b + c;
        }
        System.out.print("...");
    }
}