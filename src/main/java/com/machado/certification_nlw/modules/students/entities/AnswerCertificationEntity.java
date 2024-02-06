package com.machado.certification_nlw.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerCertificationEntity {

    private UUID id;
    private UUID studentId;
    private UUID certificationId;
    private UUID questionId;
    private UUID answerId;
    private boolean isCorrect;
}
