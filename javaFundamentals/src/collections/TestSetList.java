package collections;

import java.util.HashSet;
import java.util.Set;

public class TestSetList {

    public static void main(String[] args) {

        // valores unicos
        Set<Carro> carros = new HashSet<>();
        carros.add(new Carro("ford"));
        carros.add(new Carro("ford"));

        carros.forEach(c -> System.out.println(c.marca));
    }

}
