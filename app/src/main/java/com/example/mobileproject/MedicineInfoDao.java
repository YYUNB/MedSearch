package com.example.mobileproject;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MedicineInfoDao {
    @Insert
    void setInsertMedicineInfo(MedicineInfo medicineInfo);

    @Update
    void setUpdateMedicineInfo(MedicineInfo medicineInfo);

    @Delete
    void setDeleteMedicineInfo(MedicineInfo medicineInfo);

    @Query("SELECT * FROM MedicineInfo")
    List<MedicineInfo> getAll();

}