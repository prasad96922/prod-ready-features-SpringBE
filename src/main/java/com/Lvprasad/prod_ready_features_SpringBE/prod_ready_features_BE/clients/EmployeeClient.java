package com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.clients;

import com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeClient {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployeeById(Long employeeId);

    EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO);
}
