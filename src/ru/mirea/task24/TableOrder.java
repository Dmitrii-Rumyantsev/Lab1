package ru.mirea.task24;

public class TableOrder implements Order{
    private int size;
    private MenuItem[] items;
    @Override
    public boolean add(Order order) {
        return false;
    }

    @Override
    public String[] itemsNames() {
        return new String[0];
    }

    @Override
    public int itemsQuantity() {
        return 0;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }

    @Override
    public MenuItem[] getItems() {
        return new MenuItem[0];
    }

    @Override
    public boolean remove(MenuItem item) {
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int removeAll(MenuItem item) {
        return 0;
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        return new MenuItem[0];
    }

    @Override
    public int costTotal() {
        return 0;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public Customer setCustomer(Customer customer) {
        return null;
    }
}
