package oompa.lompas.backend.service;

import oompa.lompas.backend.model.Train;
import oompa.lompas.backend.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class TrainService {

    private final TrainRepository trainRepository;

    @Autowired
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public Train getTrain(int id)  {
        return trainRepository.findById(id).orElse(null);
    }

    public List<Train> getTrainsByRoute(int routeId) {
        return trainRepository.findTrainByRouteId(routeId);
    }

    public List<Train> getAllTrains() {
        List<Train> trains = new ArrayList<>();
        trainRepository.findAll().forEach(trains::add);
        return trains;
    }

    public Train createTrain(int capacity, int routeId, Period period) {
        Train train = new Train();
        train.setCapacity(capacity);
        train.setRouteId(routeId);
        train.setDeparturePeriod(period);
        return trainRepository.save(train);
    }

    public Train updateTrain(int id, int capacity, int routeId, Period period) {
        Train train = this.getTrain(id);
        if(train == null) {
            return null;
        }

        train.setCapacity(capacity);
        train.setRouteId(routeId);
        train.setDeparturePeriod(period);
        return trainRepository.save(train);
    }

    public void deleteTrain(int id) {
        Train train = this.getTrain(id);

        if(train != null) {
            trainRepository.delete(train);
        }
    }
}
