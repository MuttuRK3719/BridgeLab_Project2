package java8features.optionalclass.ecommerce;

import java.util.*;

public class E_Commerce {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(201, "Ravi Kumar", 1250.50, "Delivered"),
                new Order(202, "Meena Joshi", 2999.00, "Pending"),
                new Order(203, "Arjun Reddy", 450.75, "Cancelled"),
                new Order(204, "Lakshmi Narayan", 7890.00, "Shipped"),
                new Order(205, "Kavya Shetty", 320.00, "Delivered"),
                new Order(206, "Vikram Desai", 15000.00, "Processing"),
                new Order(207, "Sneha Kulkarni", 980.25, "Returned"),
                new Order(208, "Karthik Reddy", 2100.00, "Delivered")
        );
        System.out.println(names(orders));
        List<Order> emptyList = new ArrayList<>();
        OptionalDouble minOrder2 = getMinOrder1(null);
        System.out.println(minOrder2);
    }

    public static List<String> names(List<Order> orders) {
        return orders
                .stream()
                .filter(order -> order.getTotalAmount() > 5000)
                .map(order -> order.getName())
                .toList();
    }

    public static List<Order> orderCancelled(List<Order> orders) {
        return orders.stream().filter(order -> order.getStatus().equalsIgnoreCase("Cancelled")).toList();
    }
//    public static Optional<OptionalDouble> getMinOrder(List<Order> orders){
//        Optional<OptionalDouble> optionalDouble = Optional.ofNullable(orders).map(list -> list.stream().mapToDouble(Order::getTotalAmount).min());
//
//        double optionalDouble1 = optionalDouble.orElse(Double.MAX_VALUE);
//    }

    public static OptionalDouble getMinOrder1(List<Order> orders) {
        return Optional
                .ofNullable(orders)
                .map(list -> list.stream()
                        .mapToDouble(Order::getTotalAmount).min())
                .orElse(OptionalDouble.of(0.0));
    }
}
