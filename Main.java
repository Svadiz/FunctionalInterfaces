public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(50, 2); // Здесь в качестве аргументов передавались буквы.
        int d = calc.abs.apply(-10); // Та самая операция взятия по модулю, где заменил тернарный оператор на полный блок кода.
        calc.println.accept(c);
        calc.println.accept(d); // работает! :)
    }
}
