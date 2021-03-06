package me.SuperRonanCraft.BetterRTP.references.worlds;

import java.util.List;

public interface RTPWorld {

    boolean getUseWorldborder();

    int getCenterX();

    int getCenterZ();

    int getMaxRad();

    int getMinRad();

    int getPrice();

    List<String> getBiomes();

    String getWorld();
}
