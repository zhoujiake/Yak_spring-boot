package com.example.yak.yak;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.ModelAndView;

import com.example.yak.domain.model.Datebase;
import com.example.yak.service.DatebaseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BingoApplicationTest {

	@Autowired
    private DatebaseService datebaseService;
	
		
		@Test
	    public void page(){
	        List<Datebase> datebaseList =  datebaseService.findDatebaseList();
	       System.err.println("name:"+datebaseList.get(0).getName()+"  sex:"+datebaseList.get(0).getSex());
	       ModelAndView mav = new ModelAndView("/datebase/datebase1");
	       mav.addObject("test",datebaseList.get(0));
	    }
		
}













































