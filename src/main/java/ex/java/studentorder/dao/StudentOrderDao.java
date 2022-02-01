package ex.java.studentorder.dao;

import ex.java.studentorder.domain.StudentOrder;
import ex.java.studentorder.exception.DaoException;
import org.postgresql.util.PSQLException;

import java.util.List;

public interface StudentOrderDao {
    Long saveStudentOrder(StudentOrder so) throws DaoException, PSQLException;

    List<StudentOrder> getStudentOrders() throws DaoException;
}

