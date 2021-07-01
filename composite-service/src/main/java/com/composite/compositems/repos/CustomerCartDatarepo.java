/*
 * package com.composite.compositems.repos;
 * 
 * import java.util.List;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository; import
 * org.springframework.data.jpa.repository.Query; import
 * org.springframework.stereotype.Repository; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.composite.compositems.entity.CustomerCartEmbeddable; import
 * com.composite.compositems.entity.CustomerCartEntity;
 * 
 * @RestController public interface CustomerCartDatarepo extends
 * JpaRepository<CustomerCartEntity,CustomerCartEmbeddable>{
 * 
 * @Query("SELECT CUST_CART FROM CustomerCartEntity CUST_CART WHERE CUST_CART.id.customerId = ?1"
 * ) public List<CustomerCartEntity> findByCustomerId(int id);
 * 
 * 
 * }
 * 
 */