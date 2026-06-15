package be.thomasmore.font.controllers.admin;

import be.thomasmore.font.model.Designer;
import be.thomasmore.font.model.Font;
import be.thomasmore.font.model.FontCollection;
import be.thomasmore.font.repositories.FontCollectionRepository;
import be.thomasmore.font.repositories.FontRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class FontCollectionAdminController {
    private final FontCollectionRepository fontCollectionRepository;
    private final FontRepository fontRepository;

    private Logger logger = LoggerFactory.getLogger(FontCollectionAdminController.class);

    public FontCollectionAdminController(FontCollectionRepository fontCollectionRepository, FontRepository fontRepository) {
        this.fontCollectionRepository = fontCollectionRepository;
        this.fontRepository = fontRepository;
    }

    @GetMapping("/fontcollectionedit/{id}")
    public String fontCollectionEdit(Model model, @PathVariable Integer id) {
        if (id == null) return "admin/font-collection-edit";

        logger.info("Font collection edit page for font with id: " + id);

        Optional<FontCollection> fontCollectionFromDb = fontCollectionRepository.findById(id);

        fontCollectionFromDb.ifPresent(fontCollection -> {
            model.addAttribute("fontCollection", fontCollection);
        });

        model.addAttribute("pageIcon", "/icons/edit.svg");
        model.addAttribute("fonts", fontRepository.findAll());

        return "admin/font-collection-edit";
    }

    @ModelAttribute("fontCollection")
    public FontCollection findFontCollection(@PathVariable(required = false) Integer id) {
        logger.info("FontCollectionAdminController findFontCollection method called for id: " + id);

        if (id == null) return new FontCollection();

        Optional<FontCollection> fontCollectionFromDb = fontCollectionRepository.findById(id);

        if (fontCollectionFromDb.isPresent()) return fontCollectionFromDb.get();

        return null;
    }

    @PostMapping("/fontcollectionedit/{id}")
    public String fontCollectionEditPost(@PathVariable Integer id, FontCollection fontCollection) {
        logger.info("Font collection edit post for font collection with id: " + id);

        fontCollectionRepository.save(fontCollection);

        return "redirect:/fontcollectiondetails/" + id;
    }

    @GetMapping("/fontcollectionnew")
    public String fontCollectionNew(Model model) {
        model.addAttribute("pageIcon", "/icons/file-plus.svg");
        model.addAttribute("fonts", fontRepository.findAll());

        return "admin/font-collection-new";
    }

    @PostMapping("/fontcollectionnew")
    public String fontCollectionNewPost(FontCollection fontCollection) {

        FontCollection saved = fontCollectionRepository.save(fontCollection);

        return "redirect:/fontcollectiondetails/" + saved.getId();
    }
}
