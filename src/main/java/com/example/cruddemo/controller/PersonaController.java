package com.example.cruddemo.controller;

import com.example.cruddemo.model.Persona;
import com.example.cruddemo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/personas")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping
    public String listPersonas(Model model) {
        model.addAttribute("personas", personaService.getAllPersonas());
        return "personas/list";
    }
    
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("persona", new Persona());
        return "personas/create";
    }
    
    @PostMapping("/save")
    public String savePersona(@ModelAttribute Persona persona) {
        personaService.savePersona(persona);
        return "redirect:/personas";
    }
    
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("persona", personaService.getPersonaById(id));
        return "personas/edit";
    }
    
    @GetMapping("/delete/{id}")
    public String deletePersona(@PathVariable Long id) {
        personaService.deletePersona(id);
        return "redirect:/personas";
    }
}