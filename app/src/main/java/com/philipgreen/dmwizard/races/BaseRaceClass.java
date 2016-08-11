package com.philipgreen.dmwizard.races;

import com.philipgreen.dmwizard.data.BaseStats;
import com.philipgreen.dmwizard.data.Languages;
import com.philipgreen.dmwizard.weapons.BaseWeapon;

import java.util.HashMap;

/**
 * Created by pgreen on 8/10/16.
 */
public abstract class BaseRaceClass {
    private int mSpeed;              // Base speed in feet
    private BaseWeapon[] mWeaponProficiencies;
    private Languages[] mLanguages;
    private HashMap<BaseStats, Integer> mStatBonuses;


    public BaseRaceClass() {
        
    }

    /////////////////////////
    //   ABSTRACT METHODS  //
    /////////////////////////

    public abstract int initSpeed();
    public abstract BaseWeapon[] initWeaponProficiencies();
    public abstract Languages[] initLanguages();
    public abstract HashMap<BaseStats, Integer> initStatBonueses();
}
