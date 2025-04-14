package com.training.reportservice.controller;

import com.training.reportservice.model.AccountStatement;
import com.training.reportservice.model.AccountSummary;
import com.training.reportservice.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/statement/{id}")
    public AccountStatement getStatement(@PathVariable Long id) {
        return reportService.getAccountStatement(id);
    }

    @GetMapping("/summary/{id}")
    public AccountSummary getSummary(@PathVariable Long id) {
        return reportService.getAccountSummary(id);
    }
}
