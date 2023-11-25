package com.example.hackwestern10.Map;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hackwestern10.R;
import com.example.hackwestern10.database.UserProfile;

import java.util.ArrayList;
import java.util.List;

public class MapUserCardAdapter extends RecyclerView.Adapter<MapUserCardAdapter.ViewHolder> {
    private List<UserProfile> userProfileList = new ArrayList<>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.map_user_card,
                parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserProfile userProfile = userProfileList.get(position);
        holder.breed.setText(userProfile.getDogBreed());
        holder.name.setText(userProfile.getDogName());
        holder.pfp.setBackgroundResource(userProfile.getPicture());
    }

    @Override
    public int getItemCount() {
        return userProfileList.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setUserProfileList(List<UserProfile> list) {
        userProfileList = list;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, breed;
        ImageView pfp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.map_user_card_name);
            breed = itemView.findViewById(R.id.map_user_card_breed);
            pfp = itemView.findViewById(R.id.map_user_card_pfp);
        }

        public TextView getName() {
            return name;
        }

        public TextView getBreed() {
            return breed;
        }
    }
}
