package collections;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {

        Map<String, String> mapa = new HashMap<>();
        mapa.put("keyValue", "value12233");
        mapa.put("keyValue1", "value12233");
        mapa.put("keyValue2", "value12233");
        mapa.put("keyValue3", "value12233");

        var valorMap = mapa.get("keyValue");
        System.out.println(valorMap);

        mapa.forEach((key, value) -> System.out.println(key));

    }

}
