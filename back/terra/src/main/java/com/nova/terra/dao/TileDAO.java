package com.nova.terra.dao;

import com.nova.terra.exception.ResourceNotFoundException;
import com.nova.terra.model.Tile;
import com.nova.terra.repository.TileRepository;
import org.springframework.stereotype.Component;

@Component
public class TileDAO {
    private final TileRepository tileRepository;

    public TileDAO(TileRepository tileRepository) {
        this.tileRepository = tileRepository;
    }

    public Tile getTileById(long id){
        return tileRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot find specific tile"));
    }
    public void deleteTileById(long id){
        tileRepository.deleteById(id);
    }

    public void saveTile (Tile tile){
        tileRepository.save(tile);
    }

}
