public class even_add {
    public static void main(String[] args) {
        System.out.println("Name: Faizan Ahmed Shaikha");
        System.out.println("Register Number: 25BTIT146");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of even numbers from 1 to 100 is: " + sum);
    }

}
