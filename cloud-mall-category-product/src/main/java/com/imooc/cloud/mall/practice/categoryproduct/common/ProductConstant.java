package com.imooc.cloud.mall.practice.categoryproduct.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 描述：商品常量类
 */
@Component
public class ProductConstant {
    /**
     * 图片上传路径的配置
     */
    public static String FILE_UPLOAD_DIR;

    @Value("${file.upload.dir}")//需要去application.properties去配置
    public void setFileUploadDir(String fileUploadDir) {
        FILE_UPLOAD_DIR = fileUploadDir;
    }

}
