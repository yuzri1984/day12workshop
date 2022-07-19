package sg.edu.nus.iss.day12workshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.lang.*;

@Controller
public class WorkshopController{

    @RequestMapping(path={"/workshop"})
    public String test() {
        return "workshop";
    }

}





