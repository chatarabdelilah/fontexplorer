package be.thomasmore.font.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FontController {
    @GetMapping("/fontlist")
    public String fontList(Model model) {
        model.addAttribute("pageIcon", "/icons/type.svg");

        return "fontlist";
    }

    @GetMapping("/fontdetails")
    public String fontDetails(Model model) {
        model.addAttribute("pageIcon", "/icons/type.svg");

        return "fontdetails";
    }
}
