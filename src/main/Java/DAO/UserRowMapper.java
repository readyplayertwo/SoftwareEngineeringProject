package DAO;

/**
 * Created by gerar_000 on 15/03/2016.
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import Service.UserExtractor;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int line) throws SQLException {
        UserExtractor userExtractor = new UserExtractor();
        return userExtractor.extractData(resultSet);
    }
}
