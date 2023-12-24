package com.xht.model.entity.product;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author xht
 * @since 2023-12-24
 */
@Getter
@Setter
@Tag(name = "category_attr_value")
public class CategoryAttrValue implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 属性值
     */
    private String valueName;

    /**
     * attrId
     */
    private Integer attrId;

    /**
     * 逻辑删除
     */
    private Byte isDelete;
}
