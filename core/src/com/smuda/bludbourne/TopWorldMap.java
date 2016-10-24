package com.smuda.bludbourne;

import com.badlogic.gdx.graphics.g2d.Batch;

/**
 * Created by dennissmuda on 24/10/16.
 */

public class TopWorldMap extends Map {
  private static String _mapPath = "maps/topworld.tmx";

  TopWorldMap(){
    super(MapFactory.MapType.TOP_WORLD, _mapPath);
  }

  @Override
  public void updateMapEntities(MapManager mapMgr, Batch batch, float delta){
    for( Entity entity : _mapEntities ){
      entity.update(mapMgr, batch, delta);
    }
  }
}
