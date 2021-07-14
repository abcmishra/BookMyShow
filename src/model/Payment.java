package model;

import constants.ModeOfPayment;
import constants.PaymentStatus;

public class Payment {
    private int transactionID;
    ModeOfPayment modeOfPayment=null;
    PaymentStatus paymentStatus=null;
    private double amount=0;
    public ModeOfPayment getModeOfPayment (){
        return  modeOfPayment;
    }
    public void setModeOfPayment(ModeOfPayment modeOfPayment){
        this.modeOfPayment=modeOfPayment;
    }
    public PaymentStatus getPaymentStatus(){
        return paymentStatus;
    }
    public void setPaymentStatus(PaymentStatus paymentStatus){
        this.paymentStatus=paymentStatus;

    }



}

