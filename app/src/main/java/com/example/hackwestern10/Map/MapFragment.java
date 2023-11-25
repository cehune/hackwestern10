package com.example.hackwestern10.Map;

import android.Manifest;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
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
import android.content.pm.PackageManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hackwestern10.R;
import com.example.hackwestern10.database.UserProfile;
import com.example.hackwestern10.database.UserProfileDao;
import com.example.hackwestern10.database.UserProfileDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapFragment extends Fragment {
    private MapViewModel viewModel;
    private boolean courseLocationPermsGranted;
    private boolean fineLocationPermsGranted;

    private ActivityResultLauncher<String> requestPermissionLauncher;

    public MapFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestPermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), isGranted -> {
            if (isGranted) {
                Log.d("Permissions granted", "Permissions granted youre chilling");

            } else {
                Toast.makeText(requireContext(), "You dont have location perms granted!", Toast.LENGTH_SHORT).show();
            }
        });

        checkPermissions();
        fineLocationPermsGranted = true;
        courseLocationPermsGranted = true;

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
        if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            List<UserProfile> bin = viewModel.getNearbyUsers();
            MapUserCardAdapter mapUserCardAdapter = new MapUserCardAdapter();
            mapUserCardAdapter.setUserProfileList(bin);
            recyclerView.setAdapter(mapUserCardAdapter);
        }
       else {
            MapUserCardAdapter mapUserCardAdapter = new MapUserCardAdapter();
            mapUserCardAdapter.setUserProfileList(new ArrayList<>());
            recyclerView.setAdapter(mapUserCardAdapter);
        }


    }



    private void checkPermissions() {
        boolean fineLocationPermsGranted =
                ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION)
                        == PackageManager.PERMISSION_GRANTED;

        boolean coarseLocationPermsGranted =
                ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_COARSE_LOCATION)
                        == PackageManager.PERMISSION_GRANTED;

        if (fineLocationPermsGranted && coarseLocationPermsGranted) {
            // Both permissions are granted
            Log.d("Permissions granted", "Fine and coarse location permissions are granted");
        } else {
            // Request permissions if not granted
            List<String> permissionsToRequest = new ArrayList<>();

            if (!fineLocationPermsGranted) {
                permissionsToRequest.add(Manifest.permission.ACCESS_FINE_LOCATION);
            }

            if (!coarseLocationPermsGranted) {
                permissionsToRequest.add(Manifest.permission.ACCESS_COARSE_LOCATION);
            }

            // Request permissions
            if (!permissionsToRequest.isEmpty()) {
                for (String permission : permissionsToRequest) {
                    requestPermissionLauncher.launch(permission);
                }
            }
        }
    }
}