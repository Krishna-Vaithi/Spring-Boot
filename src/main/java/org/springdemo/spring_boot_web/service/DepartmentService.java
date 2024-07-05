package org.springdemo.spring_boot_web.service;

import org.springdemo.spring_boot_web.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartment(Long departmentId);

    public Department updateDeaprtment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String name);
}
