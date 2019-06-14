package com.example.rabia.nestedrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ChildAdapter  extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {
    private List<ChildModel> childModels;
    private Context context;
    private LayoutInflater layoutInflater;

    public ChildAdapter(List<ChildModel> childModels, Context context) {
        this.childModels = childModels;
        this.context = context;
        this.layoutInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=layoutInflater.inflate(R.layout.child_recyclerview,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ChildModel model=childModels.get(i);
        viewHolder.textView.setText(model.getDescription());
        Integer image=model.getImage();
        Picasso.with(context).load(image).placeholder(R.drawable.placeholder).into(viewHolder.imageView);


    }

    @Override
    public int getItemCount() {
        return childModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.child_des);
            imageView=itemView.findViewById(R.id.image_child);
        }
    }
}
