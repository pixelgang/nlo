package com.ecomexpert.nlo.db;

import com.ecomexpert.nlo.viewobject.PSAppVersion;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface PSAppVersionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PSAppVersion psAppVersion);

    @Query("DELETE FROM PSAppVersion")
    void deleteAll();
}