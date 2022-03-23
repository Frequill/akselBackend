package basePackage.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;

@Repository
public class CustomerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertCustomer(String name, String email_address, String credit_card_nr){
        String query = "CALL biograf.add_customer('" + name + "', '" + email_address + "', '" + credit_card_nr + "');";
        int result = jdbcTemplate.update(query);

        if (result > 0){
            System.out.println("Customer successfully added!");
        } else {
            System.out.println("Something went wrong...");
        }
    }

    public void selectAllCustomers(){
        String query = "SELECT * FROM customers;";
        int result = jdbcTemplate.update(query);

        if (result > 0){
            System.out.println("All customers: \n" + result);
        } else {
            System.out.println("We have encountered an error!");
        }
    }
}
