package gt.com.antiguaburger.antiguaburgerweb.print;


import gt.com.antiguaburger.antiguaburgerweb.modelo.OrderEntity;

import java.util.*;

/**
 * 
 */
public interface IPrinter {

    /**
     * @param order
     */
    public void print(OrderEntity order);

}