package com.project.financial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/server", method = RequestMethod.GET)
public class ExportController {
    @GetMapping(value = "/Export")
    public void openAlert() {

    }
}
