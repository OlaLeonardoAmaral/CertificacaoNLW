package com.leonardoamaral.certification_nlw.modules.certifications.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardoamaral.certification_nlw.modules.students.entities.CertificationStudentEntity;
import com.leonardoamaral.certification_nlw.modules.students.repositories.CertificationStudentRepository;

@Service
public class Top10RankingService {
    
    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public List<CertificationStudentEntity>  execute() {
        var result = certificationStudentRepository.findTop10();
        return result;
    }
}
