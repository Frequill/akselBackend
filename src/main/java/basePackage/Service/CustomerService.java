package basePackage.Service;

import basePackage.Dao.CustomerDao;
import basePackage.dataBaseClasses.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public void insertCustomer(Customer customer){
        customerDao.insertCustomer(customer.getCustomer_name(), customer.getCustomer_email(), customer.getCreditcard_number());
    }

    public void selectAllCustomers(){
        customerDao.selectAllCustomers();
    }
}
