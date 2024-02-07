package com.machado.certification_nlw.modules.students.usecases;

import com.machado.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.machado.certification_nlw.modules.students.repositories.CertificartionStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCertificationAnswersUseCase {

    @Autowired
    private CertificartionStudentRepository certificartionStudentRepository;

    public boolean execute(VerifyHasCertificationDTO dto) {
        var result = certificartionStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
        return !result.isEmpty();
    }
}
