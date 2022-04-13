package oompa.lompas.backend.controller;

import io.swagger.annotations.ApiOperation;
import oompa.lompas.backend.model.Material;
import oompa.lompas.backend.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialController {

    private final MaterialService materialService;

    @Autowired
    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping("/getById")
    @ApiOperation(value = "Get material by id", notes = "Returns material based on DB id", response = String.class)
    private Material getMaterial(int id) {
        return materialService.getMaterial(id);
    }

    @GetMapping("/getByArticle")
    @ApiOperation(value = "Get material by article", notes = "Returns material based on material article", response = String.class)
    private Material getMaterialByArticle(String article) {
        return materialService.getMaterialByArticle(article);
    }

    @GetMapping("/getAllMaterials")
    @ApiOperation(value = "Get all materials", notes = "Returns all materials", response = List.class)
    private List<Material> getAllMaterials() {
        return materialService.getAllMaterials();
    }

    @PostMapping("/createMaterial")
    @ApiOperation(value = "Create material", notes = "Create material and return id", response = String.class)
    private int createMaterial(String article, int amount) {
        return materialService.createMaterial(article, amount).getId();
    }

    @PutMapping("/updateMaterial")
    @ApiOperation(value = "Update material", notes = "Update material and return id", response = String.class)
    private int updateMaterial(int id, String article, int amount) {
        return materialService.updateMaterial(id, article, amount).getId();
    }

    @DeleteMapping("/deleteMaterial")
    @ApiOperation(value = "Delete material", notes = "Delete material", response = String.class)
    private void deleteMaterial(int id) {
        materialService.deleteMaterial(id);
    }
}
