package ex.java.studentorder.dao;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;

public class DBinit {
    // заново создает таблицы с тестовыми данными перед каждым запуском тестов
    public static void startUp() throws  Exception {
        // ПОЛУЧЕНИ ССЫЛКИ НА ФАЙЛ, РАСПОЛОЖЕННЫЙ В ПРОЕКТЕ (uniform resource locator)
        // путь указывается относительно папки classes в target
        URL url1 = DictionaryDaoImplTest.class.getClassLoader().getResource("student_project.sql");
        URL url2 = DictionaryDaoImplTest.class.getClassLoader().getResource("student_data.sql");
        // список строк файла, находящегося в собранном проекте
        List<String> str1 = Files.readAllLines(Paths.get(url1.toURI()));
        String sql1 = str1.stream().collect(Collectors.joining());

        // собираем список строк в одну строку с помощью stream API
        List<String> str2 = Files.readAllLines(Paths.get(url2.toURI()));
        String sql2 = str2.stream().collect(Collectors.joining());
        //
        try (Connection con = ConnectionBuilder.getConnection();
             Statement stmt = con.createStatement();) {
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
        }
    }
}
