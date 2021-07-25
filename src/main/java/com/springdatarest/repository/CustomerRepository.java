package com.springdatarest.repository;

import com.springdatarest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "users",collectionResourceRel = "users")
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
