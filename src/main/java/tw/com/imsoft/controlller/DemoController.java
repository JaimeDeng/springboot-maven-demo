package tw.com.imsoft.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.imsoft.entity.Employee;
import tw.com.imsoft.repository.DemoRepository;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    DemoRepository demoRepository;
    @RequestMapping("/employeeList")
    public String employeeList(){
        System.out.println("HI");
        List<Employee> employees =  demoRepository.findAll();
        return employees.toString() ;
    }

}
