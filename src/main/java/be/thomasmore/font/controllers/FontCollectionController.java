package be.thomasmore.font.controllers;

import be.thomasmore.font.model.Designer;
import be.thomasmore.font.model.FontCollection;
import be.thomasmore.font.repositories.DesignerRepository;
import be.thomasmore.font.repositories.FontCollectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class FontCollectionController {
    private final FontCollectionRepository fontCollectionRepository;

    public FontCollectionController(FontCollectionRepository fontCollectionRepository) {
        this.fontCollectionRepository = fontCollectionRepository;
    }

    @GetMapping("/fontcollectionlist")
    public String fontCollectionList(Model model) {
        model.addAttribute("pageIcon", "/icons/designers.svg");
        model.addAttribute("fontCollections", fontCollectionRepository.findAll());

        return "font-collection-list";
    }

    @GetMapping({"/fontcollectiondetails/{id}", "/fontcollectiondetails"})
    public String fontCollecitonDetails(Model model, @PathVariable(required = false) Integer id) {
        model.addAttribute("pageIcon", "/icons/designers.svg");

        if (id == null) return "font-collection-details";

        long count = fontCollectionRepository.count();
        long prevId = id > 1 ? id - 1 : count;
        long nextId = id < count ? id + 1 : 1;

        Optional<FontCollection> fontCollectionFromDb = fontCollectionRepository.findById(id);
        Optional<FontCollection> prevFontCollectionFromDb = fontCollectionRepository.findById((int) prevId);
        Optional<FontCollection> nextFontCollectionFromDb = fontCollectionRepository.findById((int) nextId);

        fontCollectionFromDb.ifPresent(fontCollection -> model.addAttribute("fontCollection", fontCollection));
        prevFontCollectionFromDb.ifPresent(fontCollection -> model.addAttribute("prevFontCollection", fontCollection));
        nextFontCollectionFromDb.ifPresent(fontCollection -> model.addAttribute("nextFontCollection", fontCollection));

        model.addAttribute("prevId", prevId);
        model.addAttribute("nextId", nextId);

        return "font-collection-details";
    }
}
