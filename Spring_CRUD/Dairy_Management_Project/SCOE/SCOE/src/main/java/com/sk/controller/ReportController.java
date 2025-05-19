package com.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sk.service.ReportService;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/reports")
@CrossOrigin(origins = "*")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping
    public Map<String, Double> getMilkReport() {
        Map<String, Double> report = new HashMap<>();
        report.put("totalMilkCollected", reportService.getTotalMilkCollected());
        report.put("totalMilkDelivered", reportService.getTotalMilkDelivered());
        return report;
    }
}
