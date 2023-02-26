package com.nova.terra.service;

import com.nova.terra.dao.TileDAO;
import com.nova.terra.dto.TileDTO;
import com.nova.terra.mapper.TileMapper;
import com.nova.terra.model.Tile;
import org.springframework.stereotype.Service;

@Service
public class TileService {

    private final TileDAO tileDAO;


    public TileService(TileDAO tileDAO){
        this.tileDAO = tileDAO;
    }

    public TileDTO getTileById(long id){
        Tile tile = tileDAO.getTileById(id);
        TileDTO tileDTO = TileMapper.mapToTileDTO(tile);
        return  tileDTO;
    }

    public void deleteTileById(long id){
        tileDAO.deleteTileById(id);
    }

    public void updateTile(TileDTO tileDTO){
        Tile tile = tileDAO.getTileById(tileDTO.getId());
        tileDAO.saveTile(TileMapper.mapToUpdateTile(tile,tileDTO));
    }

    public void createTile(TileDTO tileDTO){
        tileDAO.saveTile(TileMapper.mapToNewTile(tileDTO));
    }

}
