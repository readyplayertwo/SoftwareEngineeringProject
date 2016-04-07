package DAO;

        import java.util.List;

/**
 * Created by gerar on 16/03/2016.
 */
public interface TrainDao {

    public void insertData(Train train);
    public List<Train> getTrainList();
    public void updateData(Train train);
    public void deleteData(String id);
    public Train getTrain(String id);

}