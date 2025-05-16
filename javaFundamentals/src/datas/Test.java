package datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test {

    public static void main(String[] args) {
        var date = LocalDate.of(2022, 3, 15);
        var hj = LocalDate.now();
        var dataSeisMesesAtras = hj.minusMonths(6);

        long dias = ChronoUnit.DAYS.between(dataSeisMesesAtras, hj);
        System.out.println(dias);
        var isBetween = date.isAfter(dataSeisMesesAtras) && date.isBefore(hj);
        System.out.println(isBetween);
    }

}
