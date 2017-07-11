/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1.interfacelayer.dao;

import workshop1.domain.Order;
import java.util.Optional;

/**
 *
 * @author thoma
 */
public interface OrderDao {

    void insertOrder(Order order);
    
    void updateOrder(Order order);
    
    void deleteOrder(Order order);
    
    Optional<Order> findOrderById(int orderId);
    
}