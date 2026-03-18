package be.thomasmore.font.controllers.admin;

import be.thomasmore.font.model.Designer;
import be.thomasmore.font.model.Font;
import be.thomasmore.font.repositories.DesignerRepository;
import be.thomasmore.font.repositories.FontRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class FontAdminController {
    private final FontRepository fontRepository;
    private final DesignerRepository designerRepository;

    private Logger logger = LoggerFactory.getLogger(FontAdminController.class);

    public FontAdminController(FontRepository fontRepository, DesignerRepository designerRepository) {
        this.fontRepository = fontRepository;
        this.designerRepository = designerRepository;
    }

    @GetMapping("/fontedit/{id}")
    public String fontEdit(Model model, @PathVariable Integer id) {
        if (id == null) return "admin/fontedit";

        logger.info("Font edit page for font with id: " + id);

        Optional<Font> fontFromDb = fontRepository.findById(id);
        Iterable<Designer> designersFromDb = designerRepository.findAll();

        fontFromDb.ifPresent(font -> {
            model.addAttribute("font", font);
            model.addAttribute("designers", designersFromDb);
        });

        model.addAttribute("pageIcon", "/icons/edit.svg");

        return "admin/fontedit";
    }

    @ModelAttribute("font")
    public Font findFont(@PathVariable(required = false) Integer id) {
        logger.info("FontAdminController findFont method called for id: " + id);

        if (id == null) return new Font();

        Optional<Font> fontFromDb = fontRepository.findById(id);

        if (fontFromDb.isPresent()) return fontFromDb.get();

        return null;
    }

    @PostMapping("/fontedit/{id}")
    public String fontEditPost(Model model, @PathVariable Integer id, Font font) {
        logger.info("Font edit post for font with id: " + id);

        fontRepository.save(font);

        return "redirect:/fontdetails/" + id;
    }
}
