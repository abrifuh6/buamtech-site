package com.buamtech.service;

import com.buamtech.model.Company;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    public Company getCompanyInfo() {
        return new Company(
                "Buamtech Solutions Inc.",
                "Buamtech",
                "Building scalable systems and transforming ideas into digital excellence.",
                "Surrey, British Columbia, Canada",
                "To empower individuals and organizations to deploy, scale, and innovate through intelligent automation and modern cloud architecture."
        );
    }
}
