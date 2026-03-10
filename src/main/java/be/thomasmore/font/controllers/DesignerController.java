package be.thomasmore.font.controllers;

import be.thomasmore.font.model.Designer;
import be.thomasmore.font.model.Font;
import be.thomasmore.font.repositories.DesignerRepository;
import be.thomasmore.font.repositories.FontRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class DesignerController {
    private final DesignerRepository designerRepository;

    public DesignerController(DesignerRepository designerRepository) {
        this.designerRepository = designerRepository;
    }

    @GetMapping("/designerlist")
    public String designerList(Model model) {
        model.addAttribute("pageIcon", "/icons/designers.svg");

        return "designerlist";
    }

    @GetMapping({"/designerdetails/{id}", "/designerdetails"})
    public String designerDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "designerdetails";

        long count = designerRepository.count();
        long prevId = id > 1 ? id - 1 : count;
        long nextId = id < count ? id + 1 : 1;

        Optional<Designer> designerFromDb = designerRepository.findById(id);
        Optional<Designer> prevDesignerFromDb = designerRepository.findById((int) prevId);
        Optional<Designer> nextDesignerFromDb = designerRepository.findById((int) nextId);

        designerFromDb.ifPresent(designer -> model.addAttribute("designer", designer));
        prevDesignerFromDb.ifPresent(designer -> model.addAttribute("prevDesigner", designer));
        nextDesignerFromDb.ifPresent(designer -> model.addAttribute("nextDesigner", designer));

        model.addAttribute("prevId", prevId);
        model.addAttribute("nextId", nextId);

        model.addAttribute("pageIcon", "/icons/designers.svg");

        return "designerdetails";
    }
}
