package com.org.day5;
//Custom exception for product inventory-related errors (extends RuntimeException)
class InsufficientInventoryException extends RuntimeException {
    public InsufficientInventoryException(String message) {
        super(message);
    }
}

// Service class that manages product inventory
class InventoryService {
    private int availableQuantity = 100; // Initial available quantity

    public void processOrder(int quantity) {
        if (quantity > availableQuantity) {
            // Throw a custom InsufficientInventoryException if the requested quantity exceeds available quantity
            throw new InsufficientInventoryException("Insufficient inventory. Available quantity: " + availableQuantity);
        }
        else
        {
        	System.out.println("Done.");
        }
        // Actual order processing logic goes here
        // Update inventory, process payment, etc.
    }
}

// Main class demonstrating the usage of custom runtime exception in e-commerce context
public class EcommerceApps {
    public static void main(String[] args) throws InsufficientInventoryException{
        InventoryService inventoryService = new InventoryService();

        try {
            // Attempt to process an order
            inventoryService.processOrder(190); // This should throw an InsufficientInventoryException
        } catch (InsufficientInventoryException e) {
            // Handle the InsufficientInventoryException
            System.out.println("Order processing failed: " + e.getMessage());
            // Additional error handling logic can be added here
        }
    }
}