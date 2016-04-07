package Service;

/**
 * Created by gerar_000 on 15/03/2016.
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class UserExtractor implements ResultSetExtractor<User> {

    public User extractData(ResultSet resultSet) throws SQLException,
        DataAccessException {

        User user = new User();

        user.setUserId(resultSet.getInt(1));
        user.setForeName(resultSet.getString(2));
        user.setSurName(resultSet.getString(3));
        user.setUsername(resultSet.getString(4));
        user.setPassword(resultSet.getString(5));

        return user;
    }

}