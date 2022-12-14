package com.platzi.javatests.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentPeocessorTest {

    private PaymentGateway paymentGateway;
    private PaymentPeocessor paymentPeocessor;
    @Before
    public void setup(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentPeocessor = new PaymentPeocessor(paymentGateway);
    }

    @Test
    public void payment_is_correct(){
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        PaymentPeocessor paymentPeocessor = new PaymentPeocessor(paymentGateway);
        assertTrue(paymentPeocessor.makePayment(100));
    }


    @Test
    public void payment_is_incorrect(){
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        PaymentPeocessor paymentPeocessor = new PaymentPeocessor(paymentGateway);
        assertFalse(paymentPeocessor.makePayment(100));
    }

}