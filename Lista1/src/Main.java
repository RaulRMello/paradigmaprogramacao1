//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //criando objetos na classe
        Car car = new Car();
        car.ano = 2002;
        car.modelo = "Uno";
        car.velociadade = 100;
        car.marca = "Fiat";
        car.exibirDetalhes();

        //com parametro
        Car car2 = new Car(2020, 50, "Volkswagen", "Fusca");
        car2.exibirDetalhes();
        car2.acelerarCarro(50);
        car2.exibirDetalhes();
        car2.fear(150);
        car2.fear(100);
        car2.exibirDetalhes();

        Car car3 = new Car();
        System.out.println("Digite o ano do carro: ");
        car3.ano = ler.nextInt();
        System.out.println("Digite a marca do carro: ");
        car3.marca = ler.next();
        System.out.println("Digite o Modelo do carro: ");
        car3.modelo = ler.next();
        car3.exibirDetalhes();

    }
}