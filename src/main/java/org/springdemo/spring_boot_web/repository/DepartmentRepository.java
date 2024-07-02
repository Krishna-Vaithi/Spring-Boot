package org.springdemo.spring_boot_web.repository;

import org.springdemo.spring_boot_web.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
