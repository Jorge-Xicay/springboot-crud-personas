package com.example.cruddemo.controller;

import com.example.cruddemo.model.Persona;
import com.example.cruddemo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {

    @Autowired
    private PersonaService personaService;

    // Obtener todas las personas
    @GetMapping
    public List<Persona> getAllPersonas() {
        return personaService.getAllPersonas();
    }

    // Obtener una persona por ID
    @GetMapping("/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable Long id) {
        Persona persona = personaService.getPersonaById(id);
        if (persona != null) {
            return ResponseEntity.ok(persona);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Crear una nueva persona
    @PostMapping
    public ResponseEntity<Persona> createPersona(@RequestBody Persona persona) {
        Persona nueva = personaService.savePersona(persona);
        return ResponseEntity.ok(nueva);
    }

    // Actualizar una persona existente
    @PutMapping("/{id}")
    public ResponseEntity<Persona> updatePersona(@PathVariable Long id, @RequestBody Persona personaActualizada) {
        Persona existente = personaService.getPersonaById(id);
        if (existente != null) {
            existente.setNombre(personaActualizada.getNombre());
            existente.setApellido(personaActualizada.getApellido());
            existente.setDireccion(personaActualizada.getDireccion());
            existente.setTelefono(personaActualizada.getTelefono());
            return ResponseEntity.ok(personaService.savePersona(existente));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar una persona por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable Long id) {
        Persona existente = personaService.getPersonaById(id);
        if (existente != null) {
            personaService.deletePersona(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
