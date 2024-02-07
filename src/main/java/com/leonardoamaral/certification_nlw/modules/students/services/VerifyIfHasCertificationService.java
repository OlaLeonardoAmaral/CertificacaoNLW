package com.leonardoamaral.certification_nlw.modules.students.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardoamaral.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.leonardoamaral.certification_nlw.modules.students.entities.CertificationStudentEntity;
import com.leonardoamaral.certification_nlw.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationService {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;
 
    // Executar Verify If Has Certification
    public boolean execute(VerifyHasCertificationDTO dto) {
        List<CertificationStudentEntity> result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
        
        if(!result.isEmpty()) {
            return true;
        } 
        return false;
    } 
}
