package com.example.hackwestern10.Map;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hackwestern10.R;
import com.example.hackwestern10.database.UserProfile;
import com.example.hackwestern10.database.UserProfileDao;
import com.example.hackwestern10.database.UserProfileDatabase;

import java.util.List;

public class MapFragment extends Fragment {
    private MapViewModel viewModel;

    public MapFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ViewModelProvider.AndroidViewModelFactory viewModelFactory = new ViewModelProvider.AndroidViewModelFactory();

        viewModel = new ViewModelProvider(requireActivity()).get(MapViewModel.class);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_map, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.map_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        recyclerView.setHasFixedSize(true);
        List<UserProfile> bin = viewModel.getNearbyUsers(2);
        MapUserCardAdapter mapUserCardAdapter = new MapUserCardAdapter();
        mapUserCardAdapter.setUserProfileList(bin);
        recyclerView.setAdapter(mapUserCardAdapter);

    }
}