package Controllers;

import DAO.Train;
import Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sun.security.krb5.internal.crypto.Des;

import java.sql.*;
import java.sql.Date;
import java.util.*;

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

    @RequestMapping("/trainSearch")
    public ModelAndView trainSearch(@ModelAttribute Train train){
        Map map = getTrainResultsMap();

        return new ModelAndView("trainSearch","map", map);
    }
    @RequestMapping("/addTrain")
    public String addTrain(@ModelAttribute Train train) {

        return ("AdminAddTrain");
    }

    @RequestMapping(value = "/trainSearchResults", method = RequestMethod.POST)
    public ModelAndView trainSearchResults(@ModelAttribute("train")Train train,
                                           BindingResult result, ModelMap model) {


        String Source = train.getSource();
        String Destination = train.getDestination();
        Date Date = train.getDate();

        List<Train> results = trainService.SearchTrain(Source, Destination);
        model.addAttribute("date", train.getDate());
        model.addAttribute("source", train.getSource());
        model.addAttribute("destination", train.getDestination());
        model.addAttribute("departureTime", train.getDepartureTime());
        model.addAttribute("arrivalTime", train.getArrivalTime());
        model.addAttribute("totalSeats", train.getTotalSeats());
        model.addAttribute("kilometers", train.getKilometers());
        model.addAttribute("firstClassSeats", train.getFirstClassSeats());
        model.addAttribute("secondClassASeats", train.getSecondClassASeats());
        model.addAttribute("secondClassBSeats", train.getSecondClassBSeats());
        model.addAttribute("route", train.getRoute());
        return new ModelAndView("trainList", "trainList", results);
    }

    public Map getTrainResultsMap() {
        List<Train> trainList = new ArrayList<Train>();
        trainList = trainService.getTrainList();
        Map<String, Object> map = new HashMap<String, Object>();
        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();
        List<String> sourceList = new ArrayList<String>();
        List<String> destinationList = new ArrayList<String>();
        List<Time> departureTimeList = new ArrayList<Time>();
        List<Time> arrivalTimeList = new ArrayList<Time>();
        List<Integer> totalSeatsList = new ArrayList<Integer>();
        List<Integer> kilometersList = new ArrayList<Integer>();
        List<Integer> firstClassList = new ArrayList<Integer>();
        List<Integer> secondClassAList = new ArrayList<Integer>();
        List<Integer> secondClassBList = new ArrayList<Integer>();
        List<String> routeList = new ArrayList<String>();
        List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();

        for(int i=0; i <trainList.size();i++) {

            Train individualTrain = trainList.get(i);
            idList.add(individualTrain.getTrainId());
            nameList.add(individualTrain.getName());
            sourceList.add(individualTrain.getSource());
            destinationList.add(individualTrain.getDestination());
            departureTimeList.add(individualTrain.getDepartureTime());
            arrivalTimeList.add(individualTrain.getArrivalTime());
            totalSeatsList.add(individualTrain.getTotalSeats());
            kilometersList.add(individualTrain.getKilometers());
            firstClassList.add(individualTrain.getFirstClassSeats());
            secondClassAList.add(individualTrain.getSecondClassASeats());
            secondClassBList.add(individualTrain.getSecondClassBSeats());
            routeList.add(individualTrain.getRoute());
            dateList.add(individualTrain.getDate());
        }
            map.put("ID", idList);
            map.put("Name", nameList);
            map.put("Source", sourceList);
            map.put("Destination", destinationList);
            map.put("DepartureTime", departureTimeList);
            map.put("ArrivalTimeList", arrivalTimeList);
            map.put("TotalSeats", totalSeatsList);
            map.put("Kilometers", kilometersList);
            map.put("FirstClass", firstClassList);
            map.put("SecondClassA", secondClassAList);
            map.put("SecondClassB", secondClassBList);
            map.put("Route", routeList);
            map.put("Date", dateList);

        return map;

    }

}
