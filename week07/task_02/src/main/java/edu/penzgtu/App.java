package edu.penzgtu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static double calculateTotalForFebruary2020(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getOrderDate().getYear() == 2020 &&
                                 order.getOrderDate().getMonthValue() == 2)
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static void main(String[] args) {
        // Создание клиентов
        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setName("Alice");
        customer1.setTier(1);

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setName("Bob");
        customer2.setTier(2);

        // Создание продуктов
        Product product1 = new Product();
        product1.setId(101L);
        product1.setName("Laptop");
        product1.setCategory("Electronics");
        product1.setPrice(1000.0);

        Product product2 = new Product();
        product2.setId(102L);
        product2.setName("Phone");
        product2.setCategory("Electronics");
        product2.setPrice(500.0);

        Product product3 = new Product();
        product3.setId(103L);
        product3.setName("Headphones");
        product3.setCategory("Accessories");
        product3.setPrice(100.0);

        // Создание заказов
        Order order1 = new Order();
        order1.setId(1001L);
        order1.setOrderDate(LocalDate.of(2020, 2, 5));
        order1.setDeliveryDate(LocalDate.of(2020, 2, 10));
        order1.setStatus("Delivered");
        order1.setCustomer(customer1);

        Set<Product> productsOrder1 = new HashSet<>();
        productsOrder1.add(product1);
        productsOrder1.add(product2);
        order1.setProducts(productsOrder1);

        Order order2 = new Order();
        order2.setId(1002L);
        order2.setOrderDate(LocalDate.of(2020, 2, 20));
        order2.setDeliveryDate(LocalDate.of(2020, 2, 25));
        order2.setStatus("Delivered");
        order2.setCustomer(customer2);

        Set<Product> productsOrder2 = new HashSet<>();
        productsOrder2.add(product2);
        productsOrder2.add(product3);
        order2.setProducts(productsOrder2);

        Order order3 = new Order();
        order3.setId(1003L);
        order3.setOrderDate(LocalDate.of(2020, 3, 15));
        order3.setDeliveryDate(LocalDate.of(2020, 3, 20));
        order3.setStatus("Delivered");
        order3.setCustomer(customer1);

        Set<Product> productsOrder3 = new HashSet<>();
        productsOrder3.add(product1);
        order3.setProducts(productsOrder3);

        // Список заказов
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        // Расчет общей суммы заказов за февраль 2020
        double totalSum = calculateTotalForFebruary2020(orders);
        System.out.println("Общая сумма всех заказов в феврале 2020 г.: " + totalSum);
    }
}
