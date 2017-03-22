package com.amitupadhyay.beautifulcards.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.amitupadhyay.beautifulcards.DataSet;
import com.amitupadhyay.beautifulcards.R;

import java.util.ArrayList;

/**
 * Created by aupadhyay on 3/22/17.
 */

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.ViewHolder> {

    private Context context;
    private ArrayList<DataSet> dataSetList;
    private int resource;

    public MyAdapter(Context context, ArrayList<DataSet> dataSetList, int resource) {
        this.context = context;
        this.dataSetList = dataSetList;
        this.resource = resource;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(resource, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final DataSet dataSet = dataSetList.get(position);

        holder.centerMessageTV.setText(dataSet.getTitleMessage());
        holder.centerMessageTV.setBackgroundColor(context.getResources().getColor(dataSet.getBgColor()));
        holder.description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss = dataSet.getHintMessage();
                Toast.makeText(context, ss, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataSetList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView centerMessageTV;
        ImageButton description;

        public ViewHolder(View itemView) {
            super(itemView);

            centerMessageTV = (TextView) itemView.findViewById(R.id.name);
            description = (ImageButton) itemView.findViewById(R.id.description);
        }
    }
}
