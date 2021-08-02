package com.bah.t5.repository;

import org.springframework.data.repository.CrudRepository;

import com.webage.domain.Customer;

public interface CustomersRepository extends CrudRepository<Customer, Long> {

}
