package org.example.music.app.genres;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author abukata
 */
@Controller
public class GenreController {

    @RequestMapping(value = {"/genres" }, method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("genres", "Hello jetty");
        return "index/index";
    }
}
