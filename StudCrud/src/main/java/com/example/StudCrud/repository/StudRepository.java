package com.example.StudCrud.repository;

import com.example.StudCrud.model.Stud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudRepository extends JpaRepository<Stud, String> {
}
