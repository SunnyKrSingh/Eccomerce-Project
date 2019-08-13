package com.ecm.repo;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ecm.entity.ProductEntity;
import com.ecm.entity.ProductReview;

@Repository
public interface ProductEntityRepository extends JpaRepository<ProductEntity, Serializable>, JpaSpecificationExecutor<ProductEntity> {

	void save(ProductReview prdtreviw);


}
