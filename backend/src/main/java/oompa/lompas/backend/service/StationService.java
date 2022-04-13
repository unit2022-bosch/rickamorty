package oompa.lompas.backend.service;

import oompa.lompas.backend.model.Material;
import oompa.lompas.backend.model.Station;
import oompa.lompas.backend.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationService {

    private final StationRepository stationRepository;

    @Autowired
    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public Station getStation(int id)  {
        return stationRepository.findById(id).orElse(null);
    }

    public Station getStationByArticle(String article) {
        return stationRepository.findStationByStationArticle(article);
    }

    public List<Station> getAllStations() {
        List<Station> stations = new ArrayList<>();
        stationRepository.findAll().forEach(stations::add);
        return stations;
    }

    public Station createStation(String article, String name) {
        Station station = new Station();
        station.setStationArticle(article);
        station.setName(name);
        return stationRepository.save(station);
    }

    public Station updateStation(int id, String article, String name) {
        Station station = this.getStation(id);
        if(station == null) {
            return null;
        }

        station.setStationArticle(article);
        station.setName(name);
        return stationRepository.save(station);
    }

    public void deleteStation(int id) {
        Station station = this.getStation(id);

        if(station != null) {
            stationRepository.delete(station);
        }
    }
}
