package com.leonardoamaral.certification_nlw.modules.students.services;

import org.springframework.stereotype.Service;

import com.leonardoamaral.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationService {
 
    // Executar Verify If Has Certification
    public boolean execute(VerifyHasCertificationDTO dto) {
        if(dto.getEmail().equals("leonardo3442@hotmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        } 
        return false;
    } 
}
