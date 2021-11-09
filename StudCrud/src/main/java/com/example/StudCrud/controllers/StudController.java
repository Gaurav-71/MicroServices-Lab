package com.example.StudCrud.controller;

import com.example.StudCrud.model.Stud;
import com.example.StudCrud.service.StudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudController {
    private final StudService StudService;

    public StudController(StudService StudService) {
        this.StudService = StudService;
    }

    @GetMapping("/getAllStuds")
    public List<Stud> getAllStuds() {
        return StudService.getAllStuds();
    }

    @GetMapping("/get/{StudID}")
    public Stud getStud(@PathVariable String StudID) {
        return StudService.getStud(StudID);
    }

    @PostMapping("/createStud")
    public Stud createStud(@RequestBody Stud Stud) {
        return StudService.create(Stud);
    }

    @DeleteMapping("/deleteStud/{StudId}")
    public String deleteStud(@PathVariable String StudId) {
        StudService.delete(StudId);
        return "Employee Deleted";
    }

    @PutMapping("/updateStud/{StudId}")
    public Stud updateStud(@RequestBody Stud Stud, @PathVariable String StudId) {
        return StudService.update(Stud, StudId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteStuds() {
        StudService.deleteAll();
        return "All Emplyees data deleted";
    }
}
