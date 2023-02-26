package com.nova.terra.controller;

import com.nova.terra.dto.TileDTO;
import com.nova.terra.service.TileService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TileController {

    private final TileService tileService;

    public TileController(TileService tileService){
        this.tileService = tileService;
    }

    @GetMapping("/tile/{id}")
    private TileDTO getTileById(@PathVariable long id){
        return  tileService.getTileById(id);
    }

    @PutMapping("/tile")
    private void updateTile(@RequestBody TileDTO tileDTO){
        tileService.updateTile(tileDTO);
    }

    @PostMapping("/tile")
    private void createTile(@RequestBody TileDTO tileDTO){
        tileService.createTile(tileDTO);
    }

    @DeleteMapping("/tile/id")
    private  void deleteTileById(@PathVariable long id){
        tileService.deleteTileById(id);
    }


}
