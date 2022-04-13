package oompa.lompas.backend.service;

import oompa.lompas.backend.model.Material;
import oompa.lompas.backend.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    @Autowired
    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public Material getMaterial(int id)  {
        return materialRepository.findById(id).orElse(null);
    }

    public Material getMaterialByArticle(String article) {
        return materialRepository.findMaterialByArticle(article);
    }

    public List<Material> getAllMaterials() {
        List<Material> materials = new ArrayList<>();
        materialRepository.findAll().forEach(materials::add);
        return materials;
    }

    public Material createMaterial(String article, int amount) {
        Material material = new Material();
        material.setArticle(article);
        material.setAmount(amount);
        return materialRepository.save(material);
    }

    public Material updateMaterial(int id, String article, int amount) {
        Material material = this.getMaterial(id);
        if(material == null) {
            return null;
        }

        material.setArticle(article);
        material.setAmount(amount);
        return materialRepository.save(material);
    }

    public void deleteMaterial(int id) {
        Material material = this.getMaterial(id);

        if(material != null) {
            materialRepository.delete(material);
        }
    }
}
