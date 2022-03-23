package basePackage.jpmnbackend;

import basePackage.Service.CustomerService;
import basePackage.dataBaseClasses.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;

@SpringBootApplication
@ComponentScan(basePackages = "basePackage")

@RestController
public class JpmnBackendApplication {

    @Autowired
    CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(JpmnBackendApplication.class, args);

        ApplicationContext context = SpringApplication.run(JpmnBackendApplication.class, args);
        CustomerService customerService = context.getBean(CustomerService.class);

        Customer Arnold = new Customer("Arnold Schwarzenegger", "bigaustiraman@fatgains.com", "5663378744005202");
        customerService.insertCustomer(Arnold);


        // Problemet nu: Våran syntax är säkert fel, exakt hur fixar vi våran DAO klass?
        
        // Få våra stored procedures i MySQL att nås från IntelliJ
        // Hur vet vi ifall application.properties fungerar?

    }

}
