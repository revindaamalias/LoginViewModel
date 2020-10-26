package com.example.viewmodellogin.viewmodels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.viewmodellogin.models.MahasiswaModel;

public class MahasiswaViewModel extends ViewModel {

    public MutableLiveData<MahasiswaModel> mahasiswaModelMutableLiveData = new MutableLiveData<>();
    public MahasiswaModel mahasiswaModel = new MahasiswaModel();

    public LiveData<MahasiswaModel> getMahasiswaModel() {return mahasiswaModelMutableLiveData; }

    public void inputResult(int nim, String name, int smt){
        mahasiswaModel.setNIM(mahasiswaModel.getNIM()+nim);
        mahasiswaModelMutableLiveData.setValue(mahasiswaModel);
        Log.d("NIM : ", String.valueOf(mahasiswaModel.getNIM()));

        mahasiswaModel.setNama(mahasiswaModel.getNama()+name);
        mahasiswaModelMutableLiveData.setValue(mahasiswaModel);
        Log.d("Nama : ", String.valueOf(mahasiswaModel.getNama()));

        mahasiswaModel.setSemester(mahasiswaModel.getSemester()+smt);
        mahasiswaModelMutableLiveData.setValue(mahasiswaModel);
        Log.d("Semester : ", String.valueOf(mahasiswaModel.getSemester()));
    }

//    public void inputSemester(int smt){
//        mahasiswaModel.setNIM(0);
//        mahasiswaModel.setNama(0);
//        mahasiswaModel.setSemester(0);
//    }
}