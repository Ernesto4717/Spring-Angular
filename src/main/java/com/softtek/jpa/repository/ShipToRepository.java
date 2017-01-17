package com.softtek.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.softtek.jpa.domain.ShipTo;

@Repository
public interface ShipToRepository extends JpaRepository<ShipTo, Long> {

	@Query(value="SELECT s FROM ShipTo AS s")
	List<ShipTo> shipToList();
}
