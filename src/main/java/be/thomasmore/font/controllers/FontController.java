package be.thomasmore.font.controllers;

import be.thomasmore.font.model.Font;
import be.thomasmore.font.repositories.FontRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

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

    @GetMapping({"/fontdetails/{id}", "/fontdetails"})
    public String fontDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "fontdetails";

        Optional<Font> fontFromDb = fontRepository.findById(id);

        fontFromDb.ifPresent(font -> model.addAttribute("font", font));

        model.addAttribute("pageIcon", "/icons/type.svg");

        return "fontdetails";
    }
}
