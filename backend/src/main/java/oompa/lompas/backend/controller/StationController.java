package oompa.lompas.backend.controller;

import io.swagger.annotations.ApiOperation;
import oompa.lompas.backend.model.Station;
import oompa.lompas.backend.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/station")
public class StationController {

    private final StationService stationService;

    @Autowired
    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping("/getById")
    @ApiOperation(value = "Get station by id", notes = "Returns station based on DB id", response = String.class)
    private Station getstation(int id) {
        return stationService.getStation(id);
    }

    @GetMapping("/getByArticle")
    @ApiOperation(value = "Get station by article", notes = "Returns station based on station article", response = String.class)
    private Station getStationByArticle(String article) {
        return stationService.getStationByArticle(article);
    }

    @GetMapping("/getAllStations")
    @ApiOperation(value = "Get all stations", notes = "Returns all stations", response = List.class)
    private List<Station> getAllStations() {
        return stationService.getAllStations();
    }

    @PostMapping("/createStation")
    @ApiOperation(value = "Create station", notes = "Create station and return id", response = String.class)
    private int createStation(String article, String stationName) {
        return stationService.createStation(article, stationName).getId();
    }

    @PutMapping("/updateStation")
    @ApiOperation(value = "Update station", notes = "Update station and return id", response = String.class)
    private int updateStation(int id, String article, String stationName) {
        return stationService.updateStation(id, article, stationName).getId();
    }

    @DeleteMapping("/deleteStation")
    @ApiOperation(value = "Delete station", notes = "Delete station", response = String.class)
    private void deleteStation(int id) {
        stationService.deleteStation(id);
    }
}
