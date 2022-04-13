package oompa.lompas.backend.repository;

import oompa.lompas.backend.model.Material;
import org.springframework.data.repository.CrudRepository;

public interface MaterialRepository extends CrudRepository<Material, Integer> {

    public Material findMaterialByArticle(String article);
}
