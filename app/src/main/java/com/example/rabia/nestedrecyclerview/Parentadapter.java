package com.example.rabia.nestedrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Parentadapter extends RecyclerView.Adapter<Parentadapter.ViewHolder> {
    private List<String> data;
    private Context context1;
    private LayoutInflater layoutInflater;

    public Parentadapter(List<String> data, Context context) {
        this.data = data;
        this.context1 = context;
        this.layoutInflater =LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=layoutInflater.inflate(R.layout.parent_recyclerview,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        String title=data.get(position);
        viewHolder.textView.setText(title);
        ArrayList<ChildModel> list=new ArrayList<>();
        ChildModel childModel=null;

        if(position==0){
            childModel=new ChildModel("This is Ammara",R.drawable.colg10);
        }
        if(position==1){
            childModel=new ChildModel("This is sara",R.drawable.colg12);
        }
        if(position==2){
            childModel=new ChildModel("This is Maham",R.drawable.colg10);
        }
        if(position==3){
            childModel=new ChildModel("This is Areeb",R.drawable.colg12);
        }
        if(position==4){
            childModel=new ChildModel("This is Munnef",R.drawable.colg10);
        }

        list.add(childModel);
        viewHolder.recyclerView.setLayoutManager(new LinearLayoutManager(context1));
        ChildAdapter childAdapter=new ChildAdapter(list,context1);
        viewHolder.recyclerView.setAdapter(childAdapter);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        RecyclerView recyclerView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.title);
            recyclerView=itemView.findViewById(R.id.childRecyclerView);
        }
    }
}
