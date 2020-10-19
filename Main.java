public class Main {

    public static void main(String[] args) {
        int length = 30;

        for (double y = 1; y >= -1; y -= 0.2) {
            for (double x = 0; x <= length; x += 0.2) {
                double sin = Math.sin(x);
                System.out.print(((0.1 + y) >= sin && (y - 0.1) <= sin) ? "x" : " ");
            }

            System.out.println();
        }
    }
}