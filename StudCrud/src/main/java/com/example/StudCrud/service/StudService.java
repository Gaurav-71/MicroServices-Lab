package com.example.StudCrud.service;

import com.example.StudCrud.model.Stud;
import com.example.StudCrud.repository.StudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudService {

    private final StudRepository StudRepository;

    public StudService(StudRepository StudRepository) {
        this.StudRepository = StudRepository;
    }

    public List<Stud> getAllStuds() {
        return StudRepository.findAll();
    }

    public Stud getStud(String StudID) {
        return StudRepository.findById(StudID).orElse(null);
    }


    public Stud create(Stud Stud) {
        return StudRepository.save(Stud);
    }

    public void delete(String StudId) {
        StudRepository.deleteById(StudId);
    }

    public Stud update(Stud Stud, String StudId) {
        Stud Stud1 = StudRepository.findById(StudId).get();
        Stud1.setName(Stud.getName());
        Stud1.setSemester(Stud.getSemester());
        StudRepository.save(Stud1);
        return Stud1;
    }

    public void deleteAll() {
        StudRepository.deleteAll();
    }
}
