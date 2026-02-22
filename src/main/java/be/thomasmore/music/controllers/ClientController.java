package be.thomasmore.music.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/clienthome")
    public String clientHome(Model model) {
        model.addAttribute("pageIcon", "/icons/person.svg");

        return "clienthome";
    }

    @GetMapping("/clientdetails")
    public String clientDetails(Model model) {
        model.addAttribute("pageIcon", "/icons/person.svg");

        return "clientdetails";
    }
}
