package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //desse jeito é bom porque a variável pode vir de fora
        //inclusive uma variável lida por um usuário
        //expressão lambda inline para Consumer
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        //to usando um reference method para o println
        list.forEach(System.out::println);
    }
}
