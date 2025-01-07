package org.launchcode.project.controllers;

import jakarta.validation.Valid;
import org.launchcode.project.data.EventCategoryRepository;
import org.launchcode.project.models.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("eventCategories")
public class EventCategoryController {

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    // findAll, save, findById

    @GetMapping
    public String displayAllEventCategories(Model model) {
        model.addAttribute("title", "All Categories");
        model.addAttribute("eventCategories", eventCategoryRepository.findAll());
        return "eventCategories/index";
    }

    // lives at /eventCategories/create
    @GetMapping("create")
    public String displayCreateEventCategoryForm(Model model) {
        model.addAttribute("title", "Create Category");
        model.addAttribute(new EventCategory());
        return "eventCategories/create";
    }

    // lives at /eventCategories/create
    @PostMapping("create")
    public String createEventCategory(@ModelAttribute @Valid EventCategory newEventCategory,
                                      Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Category");
            return "eventCategories/create";
        }
        eventCategoryRepository.save(newEventCategory);
        return "redirect:/eventCategories";
    }
}