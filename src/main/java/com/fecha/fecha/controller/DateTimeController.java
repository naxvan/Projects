package com.fecha.fecha.controller;


import com.fecha.fecha.entity.DataTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class DateTimeController {


    @GetMapping("/welcome")
    public String welcome() {
        return "index";
    }

    @GetMapping("/date")
    public String date(Model mode) {
        DataTime dataTime = new DataTime();
        mode.addAttribute("date", dataTime.showDate());
        return "date";
    }

    @GetMapping("/time")
    public String time(Model mode) {
        DataTime dataTime = new DataTime();
        mode.addAttribute("time", dataTime.showTime());
        return "time";
    }

}
