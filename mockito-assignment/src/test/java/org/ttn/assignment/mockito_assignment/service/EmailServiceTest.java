package org.ttn.assignment.mockito_assignment.service;



import org.ttn.assignment.mockito_assignment.domain.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    private final EmailService emailService = EmailService.getInstance();

    @Test
    void testSendEmail_ThrowsException() {
        Order order = new Order();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            emailService.sendEmail(order);
        });

        assertEquals("An Exception Occurred", exception.getMessage());
        assertFalse(order.isCustomerNotified());
    }

    @Test
    void testSendEmail_WithCC() {
        Order order = new Order();
        String cc = "test@demo.com";

        boolean result = emailService.sendEmail(order, cc);

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
    }
}
