package com.platzi.javatests.payments;

public class PaymentPeocessor {

    private PaymentGateway paymentGateway;

    public PaymentPeocessor(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount){
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        if(response.getStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        }
        /*else{
            return false;
        }*/
        return false;
    }
}
