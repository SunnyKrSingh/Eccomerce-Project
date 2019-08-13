package com.ecm.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ecm.entity.ProductEntity;
import com.ecm.entity.ProductReview;

@Repository
public interface ProductReviewRepository extends JpaRepository<ProductReview, Serializable>, JpaSpecificationExecutor<ProductReview> {

	List<ProductReview> findByProductEntity(ProductEntity obj);

}
