package com.example.viewmodellogin.view;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewmodellogin.R;
import com.example.viewmodellogin.databinding.FragmentMahasiswaBinding;
import com.example.viewmodellogin.models.MahasiswaModel;
import com.example.viewmodellogin.viewmodels.MahasiswaViewModel;

public class MahasiswaFragment extends Fragment {

    private MahasiswaViewModel vMahasiswa;

    public MahasiswaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentMahasiswaBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_mahasiswa, container, false);
        vMahasiswa = new ViewModelProvider(this).get(MahasiswaViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setViewModelMahasiswa(vMahasiswa);
        vMahasiswa.mahasiswaModelMutableLiveData.observe(getViewLifecycleOwner(), new Observer<MahasiswaModel>() {
            @Override
            public void onChanged(MahasiswaModel mahasiswaModel) {
                binding.txtNIM2.setText(Integer.toString(mahasiswaModel.getNIM()));
                binding.txtName2.setText(String.valueOf(mahasiswaModel.getNama()));
                binding.txtSemester2.setText(Integer.toString(mahasiswaModel.getSemester()));
            }
        });
        return  binding.getRoot();

    }
}