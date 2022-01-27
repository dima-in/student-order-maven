package ex.java.studentorder.dao;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SimpleRunner {
    public static void main(String[] args) {
        SimpleRunner sr = new SimpleRunner();
        sr.runTests();
    }
// reflection подразумевает получение описания любого класса который доступен
    private void runTests() {
        try {
            // получение описания класса
            Class cl = Class.forName("ex.java.studentorder.dao.DictionaryDaoImplTest");
            // получение конструкторов класса DictionaryDaoImplTest
            Constructor constructor = cl.getConstructor();
            // создание объекта/сущности
            Object entity = constructor.newInstance();
            // получение методов класса в массив
            Method[] methods = cl.getMethods();
            // вызов методов класса DictionaryDaoImplTest для объекта entity
            for (Method m : methods) {
                // если метод имеет аннотацию @Test, вызвать метод
                Test annotation = m.getAnnotation(Test.class);
                if (annotation != null){
                    m.invoke(entity);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
