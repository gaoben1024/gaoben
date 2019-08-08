package com.syc.shop.commons.vo;

import lombok.Data;

import java.io.Serializable;

/**
 *  为商品分类提供的树形节点
 */
@Data
public class ZTreeNode implements Serializable {

    /**
     * 父节点id
     */
    private Integer pId;

    /**
     * 节点id
     */
    private Integer id;

    /**
     * 节点名称
     */
    private String name;

    /**
     * 是否是父节点.
     * 注意:该属性中是isParent,对应的get和set方法分别是
     * getIsParent()和setIsParent()方法,必须是这样的方法,否则前端页面的树形控件展示不正确!
     */
    private Boolean isParent;

    /**
     * 是否展开
     */
    private Boolean open;

    /**
     * 状态值
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sortOrder;

    /**
     * 节点数量?
     */
    private Integer num;

    /**
     * 用不着
     */
    private String remark;

    /**
     * 图标
     */
    private String icon;

}
