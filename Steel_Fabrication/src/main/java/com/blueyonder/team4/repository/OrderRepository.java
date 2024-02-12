package com.blueyonder.team4.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.model.Order_Table;

@Repository
public interface OrderRepository extends JpaRepository<Order_Table,Integer> {

	Optional<Order_Table> findById(Integer i);

}
