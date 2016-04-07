package Service;

import DAO.Train;

import java.util.List;

/**
 * Created by gerar on 16/03/2016.
 */
public interface TrainService {

    public void insertData(Train train);
    public List<Train> getTrainList();
    public void deleteData(String id);
    public Train getTrain(String id);
    public void updateData(Train train);
}
