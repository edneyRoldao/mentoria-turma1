package classe_object;

public class Test {

    public static void main(String[] args) {
        var ci1 = new ContaInvestimento(1, "inter", 1000);
        var ci2 = new ContaInvestimento(1, "safdsadf", 1000);

        System.out.println(ci1 == ci2);
        System.out.println(ci1.equals(ci2));
    }

}
