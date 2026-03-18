package be.thomasmore.font.controllers.admin;

import be.thomasmore.font.repositories.DesignerRepository;
import be.thomasmore.font.repositories.FontRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
