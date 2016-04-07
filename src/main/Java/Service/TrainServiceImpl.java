package Service;

import DAO.Train;
import DAO.TrainDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by gerar on 16/03/2016.
 */
    public class TrainServiceImpl implements TrainService {

        @Autowired
        TrainDao trainDao;

        @Override
        public void insertData(Train train) {
            trainDao.insertData(train);
        }

        @Override
        public List<Train> getTrainList() {
            return trainDao.getTrainList();
        }

        @Override
        public void deleteData(String id) {
            trainDao.deleteData(id);

        }

        @Override
        public Train getTrain(String id) {
            return trainDao.getTrain(id);
        }

        @Override
        public void updateData(Train train) {
            trainDao.updateData(train);

        }

    }