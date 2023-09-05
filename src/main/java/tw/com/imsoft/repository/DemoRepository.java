package tw.com.imsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tw.com.imsoft.entity.Employee;

@Repository
public interface DemoRepository extends JpaRepository<Employee, Long> {
}
