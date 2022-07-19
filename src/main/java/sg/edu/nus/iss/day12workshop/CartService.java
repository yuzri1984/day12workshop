package sg.edu.nus.iss.day12workshop;

import java.util.List;
import java.util.ArrayList;


public class CartService {

    public List<Item> getShoppingItems() {

        List<Item> lstItems = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Prada Bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Chanel Bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Louis Vutton Bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        
        return lstItems;



    }

}
