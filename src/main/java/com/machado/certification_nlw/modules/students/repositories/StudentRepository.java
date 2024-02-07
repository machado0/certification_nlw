package com.machado.certification_nlw.modules.students.repositories;

import com.machado.certification_nlw.modules.students.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, UUID> {

    StudentEntity findByEmail(String email);
}
