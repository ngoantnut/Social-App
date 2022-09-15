package com.example.socialmediaapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.socialmediaapp.Adapter.DashboardAdapter;
import com.example.socialmediaapp.Adapter.StoryAdapter;
import com.example.socialmediaapp.Model.DashBoardModel;
import com.example.socialmediaapp.Model.StoryModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView storyRv, dashboardRv;
    ArrayList<StoryModel> list;
    ArrayList<DashBoardModel> dashBoardList;
    public HomeFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        storyRv = view.findViewById(R.id.storyRV);

        list = new ArrayList<>();
        list.add(new StoryModel(R.drawable.meo, R.drawable.live, R.drawable.profile , "Ngoan Tran"));
        list.add(new StoryModel(R.drawable.profile, R.drawable.live, R.drawable.hipster , "Ngoan Tran"));
        list.add(new StoryModel(R.drawable.profile, R.drawable.ic_video_camera, R.drawable.profile , "Ngoan Tran"));
        list.add(new StoryModel(R.drawable.profile, R.drawable.live, R.drawable.profile , "Thanh Long"));

        StoryAdapter adapter = new StoryAdapter(list, getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        storyRv.setLayoutManager(linearLayoutManager);
        storyRv.setNestedScrollingEnabled(false);
        storyRv.setAdapter(adapter);

        dashboardRv = view.findViewById(R.id.dashboardRV);
        dashBoardList = new ArrayList<>();
        dashBoardList.add(new DashBoardModel(R.drawable.profile, R.drawable.meo, R.drawable.saved,
                "Ngoan Trần","Tester", "100", "12", "1"));
        dashBoardList.add(new DashBoardModel(R.drawable.profile, R.drawable.hipster, R.drawable.saved,
                " Trần","Tester", "111", "12", "5"));
        dashBoardList.add(new DashBoardModel(R.drawable.hipster, R.drawable.nature, R.drawable.saved,
                " Trần","Tester", "111", "12", "5"));
        DashboardAdapter dashboardAdapter = new DashboardAdapter(dashBoardList, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        dashboardRv.setLayoutManager(layoutManager);
        storyRv.setNestedScrollingEnabled(false);
        dashboardRv.setAdapter(dashboardAdapter);
        return view;
    }
}