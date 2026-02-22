package be.thomasmore.music.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {
    @GetMapping("/albumlist")
    public String albumList() {
        return "albumlist";
    }

    @GetMapping("/albumdetails")
    public String albumDetails() {
        return "albumdetails";
    }
}
