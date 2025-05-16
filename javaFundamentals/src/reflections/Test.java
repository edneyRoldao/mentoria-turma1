package reflections;

import sistemabancario.Pessoa;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
        var p = Pessoa.class;
        Method[] methods = p.getMethods();
        var m = methods[1];
        System.out.println(m.getName());
    }

}
