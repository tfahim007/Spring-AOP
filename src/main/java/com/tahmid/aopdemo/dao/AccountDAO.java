package com.tahmid.aopdemo.dao;

import org.springframework.stereotype.Component;

/**
 * @author Tahmidul Islam
 */
@Component
public class AccountDAO {
    public  void addAccount(){
        System.out.println( getClass() + " Doing my work: Adding an account");
    }
}
