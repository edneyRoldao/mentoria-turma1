package casting;

import sistemabancario.Pessoa;

public class Test {

    public static void main(String[] args) {
        Cachorro a1 = new Cachorro();
        a1.nome = "draco";
        a1.raca = "canino";

        Animal a2 = new Gato();
//        a2.nome = "malfoy";
//        a2.raca = "felino";

        System.out.println(a2 instanceof Gato);

        print(a1);
        print(a2);
    }

    static void print(Animal animal) {
        if (animal instanceof Cachorro) {
            System.out.println("au au");
        } else {
            System.out.println("outro gato");
        }
    }

}
