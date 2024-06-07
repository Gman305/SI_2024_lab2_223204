import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SILab2Test {

    @Test

    public void EveryBranch(){
        List<Item> skopsko = new ArrayList<>();
        skopsko.add(new Item("Skopsko","1910003",200,0.2f));
        assertTrue((SILab2.checkCart(skopsko,500)));


        List<Item> chipsy = new ArrayList<>();
        chipsy.add(new Item("Chipsy","1310002",500,0));
        assertTrue((SILab2.checkCart(chipsy,200)));

        List<Item> rakija = new ArrayList<>();
        rakija.add(new Item("Rakija","00000",699,0.1f));
        assertTrue((SILab2.checkCart(rakija,111)));


        List<Item> riba = new ArrayList<>();
        riba.add(new Item("Riba","1738",399,0.025f));
        assertTrue((SILab2.checkCart(riba,400)));

    }

    @Test

    public void MultipleCodnition(){
        List<Item> skopsko = new ArrayList<>();
        skopsko.add(new Item("skopsko","1910003",200,0.2f));
        assertTrue(SILab2.checkCart(skopsko, 290));


        List<Item> chipsy = new ArrayList<>();
        chipsy.add(new Item("Chipsy","1310002",500,0));
        assertFalse(SILab2.checkCart(chipsy, 240));


        List<Item> rakija = new ArrayList<>();
        rakija.add(new Item("Rakija","00000",699,0.1f));
        assertTrue(SILab2.checkCart(rakija, 400));


        List<Item> riba = new ArrayList<>();
        riba.add(new Item("Riba","1738",399,0.025f));
        assertTrue(SILab2.checkCart(riba, 320));
    }

}