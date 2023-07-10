package exam;

import employeeereponsi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeecreateandfind {
    private final employeeereponsi employeeereponsi;

    @Autowired
    public employeecreateandfind(employeeereponsi employeeereponsi) {
        this.employeeereponsi = employeeereponsi;
    }

    public Employee createEmployee(Employee employee) {
        return employeeereponsi.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeereponsi.findAll();
    }
}

