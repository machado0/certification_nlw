package com.machado.certification_nlw.modules.students.usecases;

import com.machado.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        return Objects.equals(dto.getEmail(), "machado@gmail.com") && Objects.equals(dto.getTechnology(), "JAVA");
    }
}
