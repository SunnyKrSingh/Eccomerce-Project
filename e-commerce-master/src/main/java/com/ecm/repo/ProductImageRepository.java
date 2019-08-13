package com.ecm.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ecm.entity.ProductEntity;
import com.ecm.entity.ProductImage;

@Repository
public interface ProductImageRepository extends JpaRepository<ProductImage, Serializable>, JpaSpecificationExecutor<ProductImage> {

	List<ProductImage> findByProductEntity(ProductEntity obj);

}
