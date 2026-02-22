package be.thomasmore.music.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/clienthome")
    public String clientHome() {
        return "clienthome";
    }

    @GetMapping("/clientdetails")
    public String clientDetails() {
        return "clientdetails";
    }
}
