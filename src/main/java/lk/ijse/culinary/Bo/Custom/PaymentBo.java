package lk.ijse.culinary.Bo.Custom;

import lk.ijse.culinary.Bo.SuperBo;
import lk.ijse.culinary.Dto.PaymentDto;
import lk.ijse.culinary.Entity.Payment;

import java.io.IOException;
import java.util.List;

public interface PaymentBo extends SuperBo {
    boolean savePayment(PaymentDto paymentDto) throws IOException;
    List<Payment> getPaymentList() throws IOException;
}
