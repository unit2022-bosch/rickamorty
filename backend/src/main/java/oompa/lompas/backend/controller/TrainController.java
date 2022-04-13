package oompa.lompas.backend.controller;

import io.swagger.annotations.ApiOperation;
import oompa.lompas.backend.model.Train;
import oompa.lompas.backend.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/train")
public class TrainController {

    private final TrainService trainService;

    @Autowired
    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping("/getById")
    @ApiOperation(value = "Get train by id", notes = "Returns train based on DB id", response = String.class)
    private Train getTrain(int id) {
        return trainService.getTrain(id);
    }

    @GetMapping("/getByRoute")
    @ApiOperation(value = "Get train by article", notes = "Return trains based on route", response = List.class)
    private List<Integer> getTrainByArticle(int routeId) {
        return trainService.getTrainsByRoute(routeId).stream().map(Train::getId).collect(Collectors.toList());
    }

    @GetMapping("/getAllTrains")
    @ApiOperation(value = "Get all trains", notes = "Returns all trains", response = List.class)
    private List<Train> getAllTrains() {
        return trainService.getAllTrains();
    }

    @PostMapping("/createTrain")
    @ApiOperation(value = "Create train", notes = "Create train and return id", response = String.class)
    private int createTrain(int capacity, int routeId, Period period) {
        return trainService.createTrain(capacity, routeId, period).getId();
    }

    @PutMapping("/updateTrain")
    @ApiOperation(value = "Update train", notes = "Update train and return id", response = String.class)
    private int updateTrain(int id, int capacity, int routeId, Period period) {
        return trainService.updateTrain(id, capacity, routeId, period).getId();
    }

    @DeleteMapping("/deleteTrain")
    @ApiOperation(value = "Delete train", notes = "Delete train", response = String.class)
    private void deleteTrain(int id) {
        trainService.deleteTrain(id);
    }
}
