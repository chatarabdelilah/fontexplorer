package be.thomasmore.font.controllers;

import be.thomasmore.font.model.Font;
import be.thomasmore.font.repositories.FontRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class FontController {
    private final FontRepository fontRepository;

    public FontController(FontRepository fontRepository) {
        this.fontRepository = fontRepository;
    }

    @GetMapping("/fontlist")
    public String fontList(Model model,
                           @RequestParam(required = false) String name,
                           @RequestParam(required = false) String category,
                           @RequestParam(required = false) String license,
                           @RequestParam(required = false) Integer yearFrom,
                           @RequestParam(required = false) Integer yearTo,
                           @RequestParam(required = false) Boolean archived
                           ) {
        model.addAttribute("pageIcon", "/icons/type.svg");

        final Iterable<Font> allFonts = fontRepository.findByFilter(name, category, license, yearFrom, yearTo, archived);

        model.addAttribute("fonts", allFonts);

        return "fontlist";
    }

    @GetMapping({"/fontdetails/{id}", "/fontdetails"})
    public String fontDetails(Model model, @PathVariable(required = false) Integer id) {
        model.addAttribute("pageIcon", "/icons/type.svg");

        if (id == null) return "fontdetails";

        long count = fontRepository.count();
        long prevId = id > 1 ? id - 1 : count;
        long nextId = id < count ? id + 1 : 1;

        Optional<Font> fontFromDb = fontRepository.findById(id);
        Optional<Font> prevFontFromDb = fontRepository.findById((int) prevId);
        Optional<Font> nextFontFromDb = fontRepository.findById((int) nextId);

        fontFromDb.ifPresent(font -> model.addAttribute("font", font));
        prevFontFromDb.ifPresent(font -> model.addAttribute("prevFont", font));
        nextFontFromDb.ifPresent(font -> model.addAttribute("nextFont", font));

        model.addAttribute("prevId", prevId);
        model.addAttribute("nextId", nextId);

        return "fontdetails";
    }
}
