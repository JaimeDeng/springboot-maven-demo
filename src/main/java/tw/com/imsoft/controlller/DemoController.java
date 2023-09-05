package tw.com.imsoft.controlller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.imsoft.entity.Employee;
import tw.com.imsoft.repository.DemoRepository;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
public class DemoController {

    @Autowired
    DemoRepository demoRepository;
    @RequestMapping("/emp")
    public Object employeeList(){
        log.debug("init");
        List<Employee> employees =  demoRepository.findAll();
        return employees ;
    }

    @RequestMapping("/emp/insert")
    public void addEmployee(Employee employee){
        log.debug("insert");
        demoRepository.save(employee);
    }

    @RequestMapping("/emp/update")
    public void updateEmployee(Employee employee){
        log.debug("update");
        demoRepository.save(employee);
    }

    @RequestMapping("/emp/delete")
    public void deleteEmployee(String id){
        log.debug("delete");
        demoRepository.deleteById(Long.parseLong(id));
    }

}
