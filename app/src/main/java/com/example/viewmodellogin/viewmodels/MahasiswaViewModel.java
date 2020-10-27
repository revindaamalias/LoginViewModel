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

    public void addNIM(int nim){
        mahasiswaModel.setNIM(mahasiswaModel.getNIM()+nim);
        mahasiswaModelMutableLiveData.setValue(mahasiswaModel);
        Log.d("NIM : ", String.valueOf(mahasiswaModel.getNIM()));
    }

    public void addSemester(int smt){
        mahasiswaModel.setSemester(mahasiswaModel.getSemester()+smt);
        mahasiswaModelMutableLiveData.setValue(mahasiswaModel);
        Log.d("Semester : ", String.valueOf(mahasiswaModel.getSemester()));
    }

    public void ResetSmt(){
        mahasiswaModel.setSemester(0);
        mahasiswaModelMutableLiveData.setValue(mahasiswaModel);
        Log.d("Reset Semester: ", String.valueOf(mahasiswaModel.getSemester()));
    }

    public void ResetNIM(){
        mahasiswaModel.setNIM(0);
        mahasiswaModelMutableLiveData.setValue(mahasiswaModel);
        Log.d("Reset NIM: ", String.valueOf(mahasiswaModel.getNIM()));
    }

    public void ResetData(){
        mahasiswaModel.setSemester(0);
        mahasiswaModel.setNIM(0);
        mahasiswaModelMutableLiveData.setValue(mahasiswaModel);
        Log.d("Reset Semesdter : ", String.valueOf(mahasiswaModel.getSemester()));
        Log.d("Reset NIM : ", String.valueOf(mahasiswaModel.getNIM()));
    }
}