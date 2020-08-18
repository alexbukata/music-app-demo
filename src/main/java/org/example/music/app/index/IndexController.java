package org.example.music.app.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author abukata
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("welcomeMessage", "Hello jetty");
        return "index/index";
    }
}
