package ggvm.example;

public class Count {

    public static void main(String... args) {
        if (args.length > 0) {
            try {
                Integer count = Integer.parseInt(args[0]);

                for (int i = 1; i <= count; i++) {
                    System.out.println(i);
                }
            } catch (NumberFormatException e) {
                System.out.println("NaN");
            }
        }
    }
}
