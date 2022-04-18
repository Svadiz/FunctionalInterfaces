public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); /* Делить на ноль нельзя, поэтому возникала ошибка, создал полноценный
        блок кода в операции деления, если пользователь делит на ноль-получится всегда ноль */

        calc.println.accept(c);

    }
}
