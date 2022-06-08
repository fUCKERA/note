package com.example.note;

import com.example.note.system.swing.SwingTool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/*@SpringBootApplication*/
@SpringBootApplication()
public class NoteApplication {

    public static void main(String[] args) {
        //SwingTool.SwingAction();
        SpringApplication.run(NoteApplication.class, args);
    }

}
