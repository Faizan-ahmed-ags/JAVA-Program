 public class Animal {
     public static void main(String[] args) {
         System.out.println("Name: Faizan Ahmed Shaikha");
         System.out.println("Register Number: 25BTIT146");
         System.out.println("This is an example of single inheritance");
         Animals animal = new Animals();
         animal.dog();

         Wolf wolf = new Wolf();
         wolf.dog();
         wolf.howl();
     }

 }

 class Animals {
     void dog() {
         System.out.println("Dog barks");
     }
 }

 class Wolf extends Animals {
     void howl() {
         System.out.println("Wolf howls");
     }
 }