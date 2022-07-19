package sg.edu.nus.iss.day12workshop;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



//import sg.edu.nus.iss.day12workshop.CartService;

@Controller
@RequestMapping(path = {"/cart"})
public class CartController {
    
    @GetMapping(produces = { "text/html"})
    public String displayCart(Model model) {
        CartService cs = new CartService();
         List<Item> cartItems = cs.getShoppingItems();
        model.addAttribute("cart", cartItems);

        return "cart";
    }


}
