package fundamentos;

import java.util.Arrays;

public class AreaCircunferencia {

    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.141592653589793;

        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area + " m2!");
    }
}
