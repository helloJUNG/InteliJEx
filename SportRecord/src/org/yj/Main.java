package org.yj;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {

        NetworkLoader loader = new NetworkLoader();

        MovieUI ui = new MovieUI(loader);

        ui.printList();

    }


}
