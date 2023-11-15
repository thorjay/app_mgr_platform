package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_dictionary")
@ApiModel(value = "TabDictionary对象", description = "")
public class TabDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("表名")
    private String tableName;

    @ApiModelProperty("字段名")
    private String fieldName;

    @ApiModelProperty("值")
    @TableField("`key`")
    private String key;

    @ApiModelProperty("名称")
    @TableField("`value`")
    private String value;

    @ApiModelProperty("描述信息")
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TabDictionary{" +
        "id=" + id +
        ", tableName=" + tableName +
        ", fieldName=" + fieldName +
        ", key=" + key +
        ", value=" + value +
        ", remark=" + remark +
        "}";
    }
}
