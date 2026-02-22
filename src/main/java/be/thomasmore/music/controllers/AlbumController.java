package be.thomasmore.music.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {
    @GetMapping("/albumlist")
    public String albumList(Model model) {
        model.addAttribute("pageIcon", "/icons/disc.svg");

        return "albumlist";
    }

    @GetMapping("/albumdetails")
    public String albumDetails(Model model) {
        model.addAttribute("pageIcon", "/icons/disc.svg");

        return "albumdetails";
    }
}
