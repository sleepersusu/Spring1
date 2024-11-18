package com.bistro.demo.service;

import com.bistro.demo.model.MenuRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    @Autowired
    private MenuRepositoryDao menuRepository;

}
