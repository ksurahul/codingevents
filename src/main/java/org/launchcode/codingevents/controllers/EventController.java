package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    public String events (Model model) {
        List<String> events = new ArrayList<>();
        events.add("Supra");
        events.add("350z");
        events.add("911 Turbo");
        model.addAttribute("events",events);

        return "events/index";
    }

}
