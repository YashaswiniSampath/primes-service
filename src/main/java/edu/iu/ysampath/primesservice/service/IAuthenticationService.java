package edu.iu.ysampath.primesservice.service;

import edu.iu.ysampath.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;
}