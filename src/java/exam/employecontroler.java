import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class employecontroler {
    private final employeecreateandfind employeecreateandfind;

    @Autowired
    public employecontroler(employeecreateandfind employeecreateandfind) {
        this.employeecreateandfind = employeecreateandfind;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeecreateandfind.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> findAllEmployees() {
        return employeecreateandfind.findAllEmployees();
    }
}
