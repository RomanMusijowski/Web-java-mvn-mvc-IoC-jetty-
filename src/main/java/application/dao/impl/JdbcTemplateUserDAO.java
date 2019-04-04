package application.dao.impl;

import application.dao.UserDAO;
import application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author Aidar Shaifutdinov.
 */
@Component
public class JdbcTemplateUserDAO implements UserDAO {

//    @Autowired
//    @Qualifier(value = "jdbcTemplateUserDAO")
//    private JdbcTemplate jdbcTemplate;

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplateUserDAO(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> getAll() {
        return jdbcTemplate.query(
                "select * from user",
                new BeanPropertyRowMapper<>(User.class)
        );
    }

    @Override
    public User getOne(String email) {
        return jdbcTemplate.query(
                "select * from users where email = ?",
                new Object[] { email },
                new BeanPropertyRowMapper<>(User.class)
        ).stream().findAny().orElse(null);
    }

    @Override
    public void add(User user) {
        jdbcTemplate.update(
                "insert into users values(?, ?, ?)",
                user.getName(), user.getLastName(), user.getEmail()
        );
    }
}
