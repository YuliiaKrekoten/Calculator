public class Main {
    public static void main(String[] args) {
      
            Calculator calc = Calculator.instance.get();

            int a = 10;
            int b = 5;

            int c = calc.plus.apply(a, b);
            calc.println.accept(c);

            c = calc.minus.apply(a, b);
            calc.println.accept(c);

            c = calc.multiply.apply(a, b);
            calc.println.accept(c);

            c = calc.divide.apply(a, b);
            calc.println.accept(c);

            c = calc.pow.apply(a);
            calc.println.accept(c);

            c = calc.abs.apply(-a);
            calc.println.accept(c);

            boolean positive = calc.isPositive.test(a);
            System.out.println(positive);
    }
}