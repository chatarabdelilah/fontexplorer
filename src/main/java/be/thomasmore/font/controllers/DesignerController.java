package be.thomasmore.font.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DesignerController {
    @GetMapping("/designerlist")
    public String designerList(Model model) {
        model.addAttribute("pageIcon", "/icons/person.svg");

        return "designerlist";
    }

    @GetMapping("/designerdetails")
    public String designerDetails(Model model) {
        model.addAttribute("pageIcon", "/icons/person.svg");

        return "designerdetails";
    }
}
