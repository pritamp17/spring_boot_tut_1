package com.pritamCode.Springboot.tut.service;

import com.pritamCode.Springboot.tut.entity.Department;
import com.pritamCode.Springboot.tut.error.DepartmentNotFoundException;

import java.util.List;
public interface DepartmentService {

  public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();
  public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;
  public void deleteDepartmentById(Long departmentId);
  public Department updateDepartment(Long departmentId, Department department);
  Department fetchDepartmentByName(String departmentName);
}
