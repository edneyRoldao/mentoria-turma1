package casting;

public class Test2 {

    public static void main(String[] args) {

        var is = new InterfaceService();
        System.out.println(is instanceof Interface1);
        System.out.println(is instanceof Interface2);
        System.out.println(is instanceof InterfaceService);

    }

}
