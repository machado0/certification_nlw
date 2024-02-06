package com.machado.certification_nlw.modules.students.controllers;

import com.machado.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.machado.certification_nlw.modules.students.usecases.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {

        System.out.println(verifyHasCertificationDTO);
        return this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO)
                ? "Usuário já fez a prova"
                : "Usuário pode fazer a prova";
    }

}
