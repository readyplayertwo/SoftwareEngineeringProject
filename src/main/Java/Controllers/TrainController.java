package Controllers;

import DAO.Train;
import Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gerar on 16/03/2016.
 */
@Controller
public class TrainController {

    @Autowired
    TrainService trainService;

    @RequestMapping("/insertTrain")
    public String insertData(@ModelAttribute Train train) {
        if (train != null)
            trainService.insertData(train);
        return "redirect:/getTrainsList";
    }

    @RequestMapping("/getTrainsList")
    public ModelAndView getTrainList() {
        List<Train> trainList = trainService.getTrainList();
        return new ModelAndView("trainList", "trainList", trainList);
    }

    @RequestMapping("/editTrains")
    public ModelAndView editTrain(@RequestParam String id,
                                 @ModelAttribute Train train) {

        train = trainService.getTrain(id);


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("train", train);

        return new ModelAndView("editTrainsPage", "map", map);

    }

    @RequestMapping("/TrainsUpdate")
    public String updateTrain(@ModelAttribute Train train) {
        trainService.updateData(train);
        return "redirect:/getTrainsList";

    }

    @RequestMapping("/deleteTrain")
    public String deleteTrain(@RequestParam String id) {
        System.out.println("id = " + id);
        trainService.deleteData(id);
        return "redirect:/getTrainsList";
    }
}
