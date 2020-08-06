package gt.com.antiguaburger.antiguaburgerweb.controller;

import gt.com.antiguaburger.antiguaburgerweb.modelo.OrderEntity;

public interface IOrder {

    /**
     * @param whatOrder
     * @return
     */
    public OrderEntity getOrderm(String whatOrder);

}