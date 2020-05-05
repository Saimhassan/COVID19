package com.example.covid19app.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.covid19app.R;

public class HomeFragment extends Fragment {

    private TextView tvTotalConfirmed,tvTotalDeaths,tvTotalRecovered;
    private ProgressBar progressBar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //Call View
        tvTotalConfirmed = root.findViewById(R.id.tv_total_confirmed);
        tvTotalDeaths = root.findViewById(R.id.tv_deaths_confirmed);
        tvTotalRecovered = root.findViewById(R.id.tv_recovered_confirmed);
        progressBar = root.findViewById(R.id.progress_circular_home);

        getData();

        return root;
    }

    private void getData() {
        RequestQueue queue = Volley.newRequestQueue(getActivity());
        String url = "https://corona.lmao.ninja/all";

    }
}
