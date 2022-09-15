package com.example.socialmediaapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Adapter.FriendAdapter;
import com.example.socialmediaapp.Model.FriendModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<FriendModel> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);

        recyclerView = view.findViewById(R.id.friendRecyclerView);
        list = new ArrayList<>();

        list.add(new FriendModel(R.drawable.profile));
        list.add(new FriendModel(R.drawable.deaf));
        list.add(new FriendModel(R.drawable.man1));
        list.add(new FriendModel(R.drawable.man));

        FriendAdapter adapter = new FriendAdapter(list, getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        return  view;
    }
}