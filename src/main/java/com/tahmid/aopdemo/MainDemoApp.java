package com.tahmid.aopdemo;

import com.tahmid.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.tahmid.aopdemo.dao.AccountDAO;

/**
 * @author Tahmidul Islam
 */

public class MainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);

        Account account = new Account();
        theAccountDAO.addAccount();
        membershipDAO.addAccount(account);
        context.close();
    }
}
