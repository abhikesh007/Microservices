package com.composite.compositems.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.composite.compositems.entity.CustomerOrderEmbeddable;
import com.composite.compositems.entity.CustomerOrderEntity;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrderEntity, CustomerOrderEmbeddable> {

	@Query(value = "SELECT CUST_CART FROM CustomerOrderEntity CUST_CART WHERE CUST_CART.id.customerId = ?1")
	public List<CustomerOrderEntity> findByCustomerId(int id);
	
}
