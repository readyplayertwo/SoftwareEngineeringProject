package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gerar_000 on 15/03/2016.
 */
public class UserDaoImpl implements UserDao {

    @Autowired
    DataSource myDataSource;

    public void insertData(User user) {

        String sql = "INSERT INTO USERS "
                + "(Forename,Surname, USERNAME, PASSWORD,ROLE) VALUES (?,?,?,?,?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);

        jdbcTemplate.update(
                sql,
                new Object[] { user.getForeName(), user.getSurName(),
                        user.getUsername(), user.getPassword(), "ROLE_USER" });

    }

    public void insertDataAdmin (User user) {
        String sql = "INSERT INTO USERS "
                + "(Forename,Surname, USERNAME, PASSWORD,ROLE) VALUES (?,?,?,?,?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);

        jdbcTemplate.update(
                sql,
                new Object[] { user.getForeName(), user.getSurName(),
                        user.getUsername(), user.getPassword(), "ROLE_ADMIN" });

    }

    public List<User> getUserList() {
        List userList = new ArrayList();

        String sql = "select * from USERS";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
        userList = jdbcTemplate.query(sql, new UserRowMapper());
        return userList;
    }

    @Override
    public void deleteData(String id) {
        String sql = "delete from USERS where UserId=" + id;
        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
        jdbcTemplate.update(sql);

    }

    @Override
    public void updateData(User user) {

        String sql = "UPDATE USERS set Forename = ?,Surname = ?, USERNAME = ?, PASSWORD = ? where UserId = ?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);

        jdbcTemplate.update(
            sql,
            new Object[] { user.getForeName(), user.getSurName(),
                user.getUsername(), user.getPassword(), user.getUserId() });

    }

    @Override
    public User getUser(String id) {
        List<User> userList = new ArrayList<User>();
        String sql = "select * from USERS where UserId= " + id;
        JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
        userList = jdbcTemplate.query(sql, new UserRowMapper());
        return userList.get(0);
    }

}