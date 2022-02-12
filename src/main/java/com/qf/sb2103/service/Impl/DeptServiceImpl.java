package com.qf.sb2103.service.Impl;

import com.qf.sb2103.dao.DeptDAO;
import com.qf.sb2103.pojo.Dept;
import com.qf.sb2103.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDAO dao;


    @Override
    public List<Dept> query() {
        return dao.query();
    }
}
