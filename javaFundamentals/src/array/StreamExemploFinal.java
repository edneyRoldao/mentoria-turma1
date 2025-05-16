package array;

import java.util.ArrayList;
import java.util.List;

// allMatch -> retorna verdadeiro quando todos os elementos forem true
// anyMatch -> retorna verdadeiro quando pelo menos 1 elemento for true
// noneMatch -> retorna verdadeiro quando pelo nenhum elemento for true
public class StreamExemploFinal {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person(13, "Maria"));
        people.add(new Person(14, "Joaquim"));
        people.add(new Person(15, "Julia"));
        people.add(new Person(17, "Enzo"));

        boolean isTodosAdultos = people
                .stream()
                .allMatch(itemDoArray -> itemDoArray.getAge() > 17);

        boolean hasHumAdulto = people
                .stream()
                .anyMatch(itemDoArray -> itemDoArray.getAge() > 17);

        boolean naoTemAdulto = people
                .stream()
                .noneMatch(itemDoArray -> itemDoArray.getAge() > 17);

        System.out.println("allMatch -> " + isTodosAdultos);
        System.out.println("anyMatch -> " + hasHumAdulto);
        System.out.println("naoTemAdulto -> " + naoTemAdulto);
    }

}

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}