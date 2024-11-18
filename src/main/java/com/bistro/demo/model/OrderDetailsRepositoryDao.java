package com.bistro.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepositoryDao extends JpaRepository< OrderDetails, OrderDetailsId > {

}
