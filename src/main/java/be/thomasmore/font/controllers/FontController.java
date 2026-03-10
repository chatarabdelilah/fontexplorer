package be.thomasmore.font.controllers;

import be.thomasmore.font.model.Font;
import be.thomasmore.font.repositories.FontRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FontController {
    private final FontRepository fontRepository;

    public FontController(FontRepository fontRepository) {
        this.fontRepository = fontRepository;
    }

    @GetMapping("/fontlist")
    public String fontList(Model model) {
        final Iterable<Font> fontsFromDb = fontRepository.findAll();

        model.addAttribute("fonts", fontsFromDb);

        model.addAttribute("pageIcon", "/icons/type.svg");

        return "fontlist";
    }

    @GetMapping("/fontdetails")
    public String fontDetails(Model model) {
        model.addAttribute("pageIcon", "/icons/type.svg");

        return "fontdetails";
    }
}
