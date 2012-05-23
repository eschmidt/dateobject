package com.example.controller;

import com.example.entity.DateObject;
import com.example.service.DateObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DateObjectController {
    @Autowired
    private DateObjectService dateObjectService;

    @RequestMapping("/test")
    public String testDateObject(Model model) {
        DateObject mydo = dateObjectService.getOrCreateDateObject();

        model.addAttribute("mydo", mydo);

        return "testDateObject";
    }
}
