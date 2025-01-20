package personal.projects.ems_backend.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import personal.projects.ems_backend.dto.EmployeeDto;
import personal.projects.ems_backend.entity.Employee;
import personal.projects.ems_backend.mapper.EmployeeMapper;
import personal.projects.ems_backend.repository.EmployeeRepository;
import personal.projects.ems_backend.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee= employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
