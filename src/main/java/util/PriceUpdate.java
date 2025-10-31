package util;

import entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    //esse vai ser nosso consumer
    //função para atualizar o preço
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
