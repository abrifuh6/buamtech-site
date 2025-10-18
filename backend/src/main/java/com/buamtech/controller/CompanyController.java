package com.buamtech.controller;

import com.buamtech.model.Company;
import com.buamtech.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/info")
    public Company getCompanyInfo() {
        return companyService.getCompanyInfo();
    }
}
