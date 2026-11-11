public class PhoneFeatures {
    public static void main(String[] args) {
        System.out.println("Name: Faizan Ahmed Shaikha");
        System.out.println("Register Number: 25BTIT146");

        Samsung samsung = new Samsung();
        samsung.iphone();
        samsung.galaxy();
    }
}

class Phone {
    void iphone() {
        System.out.println("It has the best security features");
    }
}

class Samsung extends Phone {
    void galaxy() {
        System.out.println("It has the best display features");
    }
}
