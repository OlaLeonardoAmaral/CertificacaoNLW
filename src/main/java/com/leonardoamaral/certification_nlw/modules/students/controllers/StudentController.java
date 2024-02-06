package com.leonardoamaral.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardoamaral.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.leonardoamaral.certification_nlw.modules.students.services.VerifyIfHasCertificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationService verifyIfHasCertificationService;
    
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyIfHasCertificationDTO) {
        boolean result = this.verifyIfHasCertificationService.execute(verifyIfHasCertificationDTO);
        if(result) {
            return "Usuário não pode fazer a prova";
        } 
        
        return   "Usuário pode fazer a prova.";
    }
    
}
