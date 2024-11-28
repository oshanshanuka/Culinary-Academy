package lk.ijse.culinary.Dao.Custom;

import lk.ijse.culinary.Dao.CrudDao;
import lk.ijse.culinary.Entity.Payment;

import java.io.IOException;

public interface PaymentDao extends CrudDao<Payment> {
    String getCurrentId() throws IOException;

}
