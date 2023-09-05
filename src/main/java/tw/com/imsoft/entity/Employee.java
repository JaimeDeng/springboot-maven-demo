package tw.com.imsoft.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Employee {

    @Id
    @Column(name = "ID")
    private Long id ;

    @Column(name = "IDEN")
    private String iden ;

    @Column(name = "USERNAME")
    private String userName ;

    @Column(name = "PASSWORD")
    private String password ;

    @Column(name = "CNAME")
    private String cname ;

    @Column(name = "ENAME")
    private String ename ;

    @Column(name = "BIRTHDAY")
    private LocalDateTime birthday ;

    @Column(name = "STATUS")
    private String status ;

    @Column(name = "EFFECTIVE_DATE")
    private LocalDateTime effectiveDate ;

}
