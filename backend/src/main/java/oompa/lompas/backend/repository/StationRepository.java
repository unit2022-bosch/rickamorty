package oompa.lompas.backend.repository;

import oompa.lompas.backend.model.Material;
import oompa.lompas.backend.model.Station;
import org.springframework.data.repository.CrudRepository;

public interface StationRepository extends CrudRepository<Station, Integer> {

    public Station findStationByStationArticle(String article);
}
