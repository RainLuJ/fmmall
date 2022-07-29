package com.lujun61.beans.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_id
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.untitled
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private String untitled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.receiver_name
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private String receiverName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.receiver_mobile
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private String receiverMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.receiver_address
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private String receiverAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.total_amount
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private BigDecimal totalAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.actual_amount
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private Integer actualAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.pay_type
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private Integer payType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_remark
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private String orderRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.status
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.delivery_type
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private String deliveryType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.delivery_flow_id
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private String deliveryFlowId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_freight
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private BigDecimal orderFreight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.delete_status
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private Integer deleteStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.create_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.update_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.pay_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private Date payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.delivery_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private Date deliveryTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.flish_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private Date flishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.cancel_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private Date cancelTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.close_type
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    private Integer closeType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_id
     *
     * @return the value of orders.order_id
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_id
     *
     * @param orderId the value for orders.order_id
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.untitled
     *
     * @return the value of orders.untitled
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public String getUntitled() {
        return untitled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.untitled
     *
     * @param untitled the value for orders.untitled
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setUntitled(String untitled) {
        this.untitled = untitled == null ? null : untitled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.receiver_name
     *
     * @return the value of orders.receiver_name
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.receiver_name
     *
     * @param receiverName the value for orders.receiver_name
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.receiver_mobile
     *
     * @return the value of orders.receiver_mobile
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.receiver_mobile
     *
     * @param receiverMobile the value for orders.receiver_mobile
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.receiver_address
     *
     * @return the value of orders.receiver_address
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.receiver_address
     *
     * @param receiverAddress the value for orders.receiver_address
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.total_amount
     *
     * @return the value of orders.total_amount
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.total_amount
     *
     * @param totalAmount the value for orders.total_amount
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.actual_amount
     *
     * @return the value of orders.actual_amount
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public Integer getActualAmount() {
        return actualAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.actual_amount
     *
     * @param actualAmount the value for orders.actual_amount
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setActualAmount(Integer actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.pay_type
     *
     * @return the value of orders.pay_type
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.pay_type
     *
     * @param payType the value for orders.pay_type
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_remark
     *
     * @return the value of orders.order_remark
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public String getOrderRemark() {
        return orderRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_remark
     *
     * @param orderRemark the value for orders.order_remark
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.status
     *
     * @return the value of orders.status
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.status
     *
     * @param status the value for orders.status
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.delivery_type
     *
     * @return the value of orders.delivery_type
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.delivery_type
     *
     * @param deliveryType the value for orders.delivery_type
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType == null ? null : deliveryType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.delivery_flow_id
     *
     * @return the value of orders.delivery_flow_id
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public String getDeliveryFlowId() {
        return deliveryFlowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.delivery_flow_id
     *
     * @param deliveryFlowId the value for orders.delivery_flow_id
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setDeliveryFlowId(String deliveryFlowId) {
        this.deliveryFlowId = deliveryFlowId == null ? null : deliveryFlowId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_freight
     *
     * @return the value of orders.order_freight
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public BigDecimal getOrderFreight() {
        return orderFreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_freight
     *
     * @param orderFreight the value for orders.order_freight
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setOrderFreight(BigDecimal orderFreight) {
        this.orderFreight = orderFreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.delete_status
     *
     * @return the value of orders.delete_status
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.delete_status
     *
     * @param deleteStatus the value for orders.delete_status
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.create_time
     *
     * @return the value of orders.create_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.create_time
     *
     * @param createTime the value for orders.create_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.update_time
     *
     * @return the value of orders.update_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.update_time
     *
     * @param updateTime the value for orders.update_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.pay_time
     *
     * @return the value of orders.pay_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.pay_time
     *
     * @param payTime the value for orders.pay_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.delivery_time
     *
     * @return the value of orders.delivery_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.delivery_time
     *
     * @param deliveryTime the value for orders.delivery_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.flish_time
     *
     * @return the value of orders.flish_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public Date getFlishTime() {
        return flishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.flish_time
     *
     * @param flishTime the value for orders.flish_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setFlishTime(Date flishTime) {
        this.flishTime = flishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.cancel_time
     *
     * @return the value of orders.cancel_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.cancel_time
     *
     * @param cancelTime the value for orders.cancel_time
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.close_type
     *
     * @return the value of orders.close_type
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public Integer getCloseType() {
        return closeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.close_type
     *
     * @param closeType the value for orders.close_type
     *
     * @mbggenerated Fri Jul 29 10:45:02 CST 2022
     */
    public void setCloseType(Integer closeType) {
        this.closeType = closeType;
    }
}