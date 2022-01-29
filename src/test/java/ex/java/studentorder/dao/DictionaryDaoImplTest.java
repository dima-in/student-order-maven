package ex.java.studentorder.dao;


import ex.java.studentorder.domain.CountryArea;
import ex.java.studentorder.domain.PassportOffice;
import ex.java.studentorder.domain.RegisterOffice;
import ex.java.studentorder.domain.Street;
import ex.java.studentorder.exception.DaoException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

// получить информацию о классе по имени (reflection)
public class DictionaryDaoImplTest {
    // создание объекта типа Logger для логирования класса
    private static final Logger logger = LoggerFactory.getLogger(DictionaryDaoImplTest.class);


    @BeforeClass // аннотация помечает метод, который будет выполняться
    // при запуске всех тестов (один раз)
    public static void startUp() throws Exception {
       DBinit.startUp();
    }
    @Test
    public void testStreet() throws DaoException {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.trace("TEST {} {}", dt1, dt2);

        List<Street> d = new DictionaryDaoImpl().findStreets("росп");
        // assert утверждать, junit класс
        Assert.assertTrue(d.size() == 2);
    }
    @Test
    public void testPassportOffice() throws DaoException {
        List<PassportOffice> po = new DictionaryDaoImpl().findPassportOffice("010020000000");
        // assert утверждать, junit класс
        Assert.assertTrue(po.size() == 2);
    }
    @Test
    public void testRegisterOffice() throws DaoException {
        List<RegisterOffice> ro = new DictionaryDaoImpl().findRegisterOffice("020010010001");

        Assert.assertTrue(ro.size() == 1);
    }
    @Test
    public void testCountryArea() throws DaoException, SQLException {
        List<CountryArea> ca1 = new DictionaryDaoImpl().findAreas("");
        Assert.assertTrue(ca1.size() == 2);
        List<CountryArea> ca2 = new DictionaryDaoImpl().findAreas("020000000000");
        Assert.assertTrue(ca2.size() == 3);
        List<CountryArea> ca3 = new DictionaryDaoImpl().findAreas("020010000000");
        Assert.assertTrue(ca3.size() == 3);
        List<CountryArea> ca4 = new DictionaryDaoImpl().findAreas("020010010000");
        Assert.assertTrue(ca4.size() == 3);
    }
}