package com.ecm.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ecm.common.SizeEnum;
import com.ecm.entity.ProductEntity;
import com.ecm.entity.ProductPrice;

@Repository
public interface ProductPriceRepository extends JpaRepository<ProductPrice, Serializable>, JpaSpecificationExecutor<ProductPrice> {

	List<ProductPrice> findByProductEntity(ProductEntity obj);
	
	ProductPrice findByProductEntityAndSize(ProductEntity obj, SizeEnum valueOf);
}
