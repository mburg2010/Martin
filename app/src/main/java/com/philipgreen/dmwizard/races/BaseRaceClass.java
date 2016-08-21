package com.philipgreen.dmwizard.races;

import com.philipgreen.dmwizard.data.BaseStats;
import com.philipgreen.dmwizard.data.Languages;
import com.philipgreen.dmwizard.data.WeaponType;

import java.util.HashMap;

/**
 * Created by pgreen on 8/10/16.
 */
public abstract class BaseRaceClass {
    private int mSpeed;              // Base speed in feet
    private WeaponType[] mWeaponProficiencies;
    private Languages[] mLanguages;
    private HashMap<BaseStats, Integer> mStatBonuses;


    public BaseRaceClass() {
        this.mSpeed = initSpeed();
        this.mWeaponProficiencies = initWeaponProficiencies();
        this.mLanguages = initLanguages();
        this.mStatBonuses = initStatBonuses();
    }

    /////////////////////////
    //   ABSTRACT METHODS  //
    /////////////////////////

    public abstract int initSpeed();
    public abstract WeaponType[] initWeaponProficiencies();
    public abstract Languages[] initLanguages();
    public abstract HashMap<BaseStats, Integer> initStatBonuses();
}
