package hu.petrik.autokoop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Auto> autok = new ArrayList<>();

        Tesla s = new Tesla();
        Tesla e = new Tesla();
        Tesla x = new Tesla();
        Tesla y = new Tesla();
        Porsche nineEleven = new Porsche(10);

        autok.add(s);
        autok.add(e);
        autok.add(x);
        autok.add(y);
        autok.add(nineEleven);

        for (Auto a : autok) {
            System.out.println(a.getSebesseg());
        }
    }
}
