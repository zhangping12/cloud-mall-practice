package com.imooc.cloud.mall.practice.cartorder.feign;

import com.imooc.cloud.mall.practice.categoryproduct.model.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述：商品FeignClient
 */
@FeignClient(value = "cloud-mall-category-product")
public interface ProductFeignClient {

    @GetMapping("product/detailForFeign")
    Product detailForFeign(@RequestParam Integer id);
}
