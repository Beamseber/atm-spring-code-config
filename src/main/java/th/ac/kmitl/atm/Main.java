package th.ac.kmitl.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);
        ATM atm = context.getBean(ATM.class);

        String nane = atm.validateCustomer(2,2345);
        System.out.println(nane+"has"+atm.getBalance());
        atm.withdraw(200);
        System.out.println(nane+"has"+atm.getBalance());
    }
}
