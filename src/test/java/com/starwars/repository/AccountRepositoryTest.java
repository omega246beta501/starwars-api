package com.starwars.repository;

import com.starwars.model.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void testAccount() {
        String expected = "admin";
        Account real = accountRepository.findOne("1");

        Assert.assertEquals(expected, real.getUsername());
    }
}
