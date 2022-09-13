package com.tahmid.aopdemo.dao;

import com.tahmid.aopdemo.Account;
import org.springframework.stereotype.Component;

/**
 * @author Tahmidul Islam
 */
@Component
public class MembershipDAO {
    public  void addAccount(Account account){
        System.out.println( getClass()
                + " Doing my work: Adding an Membership account");
    }
}
