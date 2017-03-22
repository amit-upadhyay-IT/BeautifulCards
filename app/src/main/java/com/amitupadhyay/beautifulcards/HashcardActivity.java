package com.amitupadhyay.beautifulcards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.amitupadhyay.beautifulcards.adapter.MyAdapter;

import java.util.ArrayList;

public class HashcardActivity extends AppCompatActivity {

    private ArrayList<DataSet> dataSetList;
    private RecyclerView recyclerView;

    private void initViews()
    {
        recyclerView = (RecyclerView) findViewById(R.id.hashCardRecyclerView);

        initList();

    }

    public void initList()
    {
        dataSetList = new ArrayList<>();

        DataSet dataSet1 = new DataSet("Android", "Knowledge at its best", android.R.color.holo_red_light);
        DataSet dataSet2 = new DataSet("Data Structure", "Deep understanding", android.R.color.holo_blue_bright);
        DataSet dataSet3 = new DataSet("Algorithms", "good knowledge", android.R.color.holo_green_dark);
        DataSet dataSet4 = new DataSet("Node.js", "Love this technology", android.R.color.holo_orange_dark);
        DataSet dataSet5 = new DataSet("C", "learnt to do data structure", android.R.color.holo_green_light);
        DataSet dataSet6 = new DataSet("C++", "inherited", android.R.color.holo_blue_dark);
        DataSet dataSet7 = new DataSet("python", "learnt to do data structure", android.R.color.holo_green_light);
        DataSet dataSet8 = new DataSet("Java", "Knowledge at its best", android.R.color.holo_red_light);

        dataSetList.add(dataSet1);
        dataSetList.add(dataSet2);
        dataSetList.add(dataSet3);
        dataSetList.add(dataSet4);
        dataSetList.add(dataSet5);
        dataSetList.add(dataSet6);
        dataSetList.add(dataSet7);
        dataSetList.add(dataSet8);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashcard);

        initViews();


        MyAdapter myAdapter = new MyAdapter(this, dataSetList, R.layout.list_item_dashmenu);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);
        GridLayoutManager glm = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(glm);
        recyclerView.setAdapter(myAdapter);

    }
}
