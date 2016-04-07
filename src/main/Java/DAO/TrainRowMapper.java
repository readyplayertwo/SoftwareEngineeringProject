package DAO;

import Service.TrainExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by gerar on 16/03/2016.
 */
public class TrainRowMapper implements RowMapper<Train> {


    @Override
    public Train mapRow(ResultSet resultSet, int line) throws SQLException {
        TrainExtractor trainExtractor = new TrainExtractor();
        return trainExtractor.extractData(resultSet);
    }
}


