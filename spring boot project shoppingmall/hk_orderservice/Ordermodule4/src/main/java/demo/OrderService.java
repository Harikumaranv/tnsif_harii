package demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Create a new order
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get order by ID
    public Order getOrderById(Long id) throws OrderNotFoundException {
        Optional<Order> order = orderRepository.findById(id);
        if (order.isPresent()) {
            return order.get();
        } else {
            throw new OrderNotFoundException("Order not found with id: " + id);
        }
    }

    // Update order
    public Order updateOrder(Long id, Order updatedOrder) throws OrderNotFoundException {
        return orderRepository.findById(id).map(order -> {
            order.setProduct(updatedOrder.getProduct());
            order.setQuantity(updatedOrder.getQuantity());
            order.setTotalPrice(updatedOrder.getTotalPrice());
            return orderRepository.save(order);
        }).orElseThrow(() -> new OrderNotFoundException("Order not found with id: " + id));
    }

    // Delete order
    public void deleteOrder(Long id) throws OrderNotFoundException {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
        } else {
            throw new OrderNotFoundException("Order not found with id: " + id);
        }
    }
}
