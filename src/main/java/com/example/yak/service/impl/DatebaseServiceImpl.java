package com.example.yak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yak.domain.dao.DatebaseDao;
import com.example.yak.domain.model.Datebase;
import com.example.yak.service.DatebaseService;


@Service
public class DatebaseServiceImpl implements DatebaseService {

	
	@Autowired
    private DatebaseDao datebaseDao;

    @Override
    public List<Datebase> findDatebaseList() {
        return datebaseDao.findDatebaseList();
    }

}












