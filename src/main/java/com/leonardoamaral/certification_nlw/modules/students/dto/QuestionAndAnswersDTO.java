package com.leonardoamaral.certification_nlw.modules.students.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionAndAnswersDTO {
    
    private UUID questionID;
    private UUID alternativeID;
    private boolean isCorrect;
}
