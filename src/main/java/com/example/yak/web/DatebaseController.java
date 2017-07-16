package com.example.yak.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.yak.domain.model.Datebase;
import com.example.yak.service.DatebaseService;


@Controller
@RequestMapping("/templates/")
public class DatebaseController {

	@Autowired
    private DatebaseService datebaseService;

    @RequestMapping("/page")
    public String page(){
        /*List<Datebase> datebaseList =  datebaseService.findDatebaseList();
        ModelAndView mav = new ModelAndView("/datebase/datebase1");
        mav.addObject("test",datebaseList.get(0));*/
    	System.out.println("--------->"+"---------->");
        return "index.html";
    }
}






























