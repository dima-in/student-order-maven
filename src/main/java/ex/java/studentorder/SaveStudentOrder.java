package ex.java.studentorder;

import ex.java.studentorder.dao.StudentOrderDaoImpl;
import ex.java.studentorder.domain.*;
import ex.java.studentorder.exception.DaoException;

import java.time.LocalDate;

public class SaveStudentOrder
{

//    public static void main(String[] args) throws DaoException {  // удалить
//
//        StudentOrder so = buildStudentOrder(10);
//        StudentOrderDaoImpl dao = new StudentOrderDaoImpl();
//        Long i = dao.saveStudentOrder(so);
//        System.out.println(i);
//    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("SaveStudentOrder:");
        return answer;
    }

//    public static StudentOrder buildStudentOrder(long id) {
//        // метод заполняет заявку тестовыми данными
//
//        StudentOrder so = new StudentOrder();
//
//        so.setStudentOrderID(id);
//        so.setMarriageCertificateId("" + (1234560000 + id));
//        so.setMarriageDate(LocalDate.of(2016,7,4));
//        RegisterOffice registerOffice =
//                new RegisterOffice(1L, "","ЗАГЗ №");
//        so.setMarriageOffice(registerOffice);
//
//        Street street = new Street(1L, "Кутузовский проспект");
//        Address address = new Address("235714L", street, "32","1", "103");
//
//        Adult husband = new Adult("Марш", "Рэнди","Марвин", LocalDate.of(1952,01,19));
//        husband.setPassportSeries("" + (1000 + id));
//        husband.setPassportNumber("" + (100000 + id));
//        husband.setIssueData(LocalDate.of(2010,12,3));
//        PassportOffice passportOffice1 =
//                new PassportOffice(1L,"552","Пастортный стол №");
//        husband.setIssueDepartment(passportOffice1);
//        husband.setStudentID("" + 10000 +id);
//        husband.setAddress(address);
//        husband.setUniversity(new University(2L, "")); // запись аналогична PassportOffice
//        husband.setStudentID("HH12345");
//
//        Adult wife = new Adult(null, "Шерон", "Эйприл",LocalDate.of(1952, 03,5));
//        wife.setPassportSeries("" + (2000 + id));
//        wife.setPassportNumber("" + (200000 + id));
//        wife.setIssueData(LocalDate.of(2010,10,7));
//        PassportOffice passportOffice2 =
//                new PassportOffice(2L,"","Пастортный стол №");
//        wife.setIssueDepartment(passportOffice2);
//        wife.setStudentID("" + 20000 +id);
//        wife.setAddress(address);
//        wife.setUniversity(new University(1L,""));
//        wife.setStudentID("WW12345");
//
//        Child child1 = new Child("Марш", "Стенли", "Рендалл",LocalDate.of(2013, 11,22));
//        child1.setCertificateNumber("" + (30000 + id));
//        child1.setIssueDate(LocalDate.of(2013, 11, 23));
//        RegisterOffice registerOffice1 =
//                new RegisterOffice(3L, "","ЗАГЗ №"  + id);
//        child1.setIssueDepartment(registerOffice1);
//        child1.setAddress(address);
//
//        Child child2 = new Child("Марш", "Шелли", "Рендалл",LocalDate.of(2013, 11,22));
//        child2.setCertificateNumber("" + (40000 + id));
//        child2.setIssueDate(LocalDate.of(2020, 6, 13));
//        RegisterOffice registerOffice2 =
//                new RegisterOffice(4L, "","ЗАГЗ №"  + id);
//        child2.setIssueDepartment(registerOffice2);
//        child2.setAddress(address);
//
//        //передача параметров
//        so.setHusband(husband);
//        so.setWife(wife);
//        so.addChild(child1);
//        so.addChild(child2);
//
//        return so;
//    }

}
