package com.qf.sb2103.controllers;

import com.qf.sb2103.pojo.Dept;
import com.qf.sb2103.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptControllers {
    @Autowired
    private DeptService deptService;
    @GetMapping("/query")
    public List<Dept> query(){
        return deptService.query();
    }
}
