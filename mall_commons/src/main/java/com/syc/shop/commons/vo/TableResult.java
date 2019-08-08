package com.syc.shop.commons.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * DataTables控件所需要的json响应结果.
 * 给前端表格封装的JavaBean
 */
@Data
public class TableResult implements Serializable {

    //必要。绘制计数器:这个是用来确保Ajax从服务器返回的是对应的操作次数（Ajax是异步的，因此返回的顺序是不确定的）.
    //要求在服务器接收到此参数后再返回.
    // Datatables发送的draw是多少那么服务器就返回多少。
    private Integer draw;//当前点击分页按钮的次数

    /**
     * 必要。即没有过滤的记录数（数据库里总共记录数）
     * 商品总数量
     */
    private Long recordsTotal;

    /**
     * 必要.过滤后的记录数（如果有接收到前台的过滤条件，则返回的是过滤后的记录数）
     * 符合条件的商品总数量
     */
    private Long recordsFiltered;

    /**
     * 必要。表中中需要显示的数据。这是一个对象数组，也可以只是数组，区别在于 纯数组前台就不需要用 columns绑定数据，会自动按照顺序去显示 ，而对象数组则需要使用 columns绑定数据才能正常显示。
     * 分页结果中封装的商品信息数据
     */
    private List<?> data;

    //可选。你可以定义一个错误来描述服务器出了问题后的友好提示
    private String error;

    private Boolean success;

}
