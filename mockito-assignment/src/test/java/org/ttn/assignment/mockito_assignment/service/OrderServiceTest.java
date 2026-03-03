package org.ttn.assignment.mockito_assignment.service;


import org.ttn.assignment.mockito_assignment.domain.Order;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderServiceTest {

    private OrderService orderService;
    private EmailService emailServiceMock;
    private MockedStatic<EmailService> mockedEmailService;

    @BeforeEach
    void setUp() {
        emailServiceMock = mock(EmailService.class);
        mockedEmailService = mockStatic(EmailService.class);
        mockedEmailService.when(EmailService::getInstance).thenReturn(emailServiceMock);
        orderService = OrderService.getInstance();
    }

    @AfterEach
    void tearDown() {
        mockedEmailService.close();
    }

    @Test
    void testPlaceOrder_Success_WithCC() {
        Order order = new Order(1, "Item A", 100.0);
        String cc = "manager@demo.com";
        when(emailServiceMock.sendEmail(any(Order.class), eq(cc))).thenReturn(true);

        boolean result = orderService.placeOrder(order, cc);

        assertTrue(result);
        assertEquals(120.0, order.getPriceWithTax());
        assertTrue(order.isCustomerNotified());
        verify(emailServiceMock, times(1)).sendEmail(order, cc);
    }

    @Test
    void testPlaceOrder_Fails_WhenEmailServiceThrowsException() {
        Order order = new Order(1, "Item B", 200.0);
        doThrow(new RuntimeException("An Exception Occurred")).when(emailServiceMock).sendEmail(any(Order.class));

        assertThrows(RuntimeException.class, () -> orderService.placeOrder(order));
        assertEquals(240.0, order.getPriceWithTax());
    }
}
