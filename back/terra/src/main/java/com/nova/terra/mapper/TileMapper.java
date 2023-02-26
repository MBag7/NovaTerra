package com.nova.terra.mapper;

import com.nova.terra.dto.TileDTO;
import com.nova.terra.model.Tile;

public class TileMapper {

    public static Tile mapToNewTile(TileDTO tileDTO){
        Tile tile = new Tile(
                tileDTO.getTitle(),
                tileDTO.getContent()
        );
        return tile;
    }

    public static TileDTO mapToTileDTO(Tile tile){
        TileDTO tileDTO = new TileDTO(
                tile.getId(),
                tile.getTitle(),
                tile.getContet()
        );
        return  tileDTO;
    }

    public static Tile mapToUpdateTile(Tile tile,TileDTO tileDTO){
        tile.setTitle(tileDTO.getTitle());
        tile.setContet(tileDTO.getContent());
        return tile;
    }
}
