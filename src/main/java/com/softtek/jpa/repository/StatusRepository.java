package com.softtek.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.jpa.domain.Status;

@Repository
public interface StatusRepository  extends JpaRepository<Status, Long>{
	
	@Query(value="SELECT s FROM Status AS s WHERE s.type= :type")
	List<Status> statusList(@Param("type")String type);

}
