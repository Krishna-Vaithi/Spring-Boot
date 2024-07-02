package org.springdemo.spring_boot_web.controller;

import org.springdemo.spring_boot_web.entity.Department;
import org.springdemo.spring_boot_web.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(Department department){
        return departmentService.saveDepartment(department);
    }
}
