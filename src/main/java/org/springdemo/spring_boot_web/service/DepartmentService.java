package org.springdemo.spring_boot_web.service;

import org.springdemo.spring_boot_web.entity.Department;
import org.springdemo.spring_boot_web.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartment(Long departmentId);

    public Department updateDeaprtment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String name);
}
