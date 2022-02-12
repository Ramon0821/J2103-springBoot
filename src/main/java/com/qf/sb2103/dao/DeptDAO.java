package com.qf.sb2103.dao;

import com.qf.sb2103.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DeptDAO {
    public List<Dept> query();
}
