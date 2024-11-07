package lk.ijse.culinary.BO;

import lk.ijse.culinary.BO.Custom.Impl.CourseBOImpl;
import lk.ijse.culinary.BO.Custom.Impl.StudentBOImpl;
import lk.ijse.culinary.BO.Custom.Impl.UserBOImpl;
public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getBOFactory() {
        return boFactory == null ? boFactory = new BOFactory() : boFactory;
    }

    public enum BoType {
        USER,COURSE,STUDENT
    }

    public SuperBO getBOType(BoType boType) {
        switch (boType) {
            case USER:
                return new UserBOImpl();
            case COURSE:
                return new CourseBOImpl();
            case STUDENT:
                return new StudentBOImpl();
            default:
                return null;
        }
    }
}
