package com.mateuscnh.certification_nlw.modules.students.services;

import org.springframework.stereotype.Service;
import com.mateuscnh.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationService {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("mtscnh@gmail.com") && dto.getTechnology().equals("Java")) {
            return true;
        }
        return false;
    }
}
