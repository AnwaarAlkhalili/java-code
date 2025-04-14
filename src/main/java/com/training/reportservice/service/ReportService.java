package com.training.reportservice.service;

import com.training.reportservice.model.AccountStatement;
import com.training.reportservice.model.AccountSummary;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ReportService {

    public AccountStatement getAccountStatement(Long id) {
        return new AccountStatement(id, Arrays.asList(
                "Transaction 1: -10 OMR",
                "Transaction 2: +50 OMR",
                "Transaction 3: -5 OMR"
        ));
    }

    public AccountSummary getAccountSummary(Long id) {
        return new AccountSummary(id, 200.75);  // fake balance
    }
}
