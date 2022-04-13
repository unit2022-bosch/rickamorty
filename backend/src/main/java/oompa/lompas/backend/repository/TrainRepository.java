package oompa.lompas.backend.repository;

import oompa.lompas.backend.model.Material;
import oompa.lompas.backend.model.Station;
import oompa.lompas.backend.model.Train;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrainRepository extends CrudRepository<Train, Integer> {

    public List<Train> findTrainByRouteId(int route);
}
