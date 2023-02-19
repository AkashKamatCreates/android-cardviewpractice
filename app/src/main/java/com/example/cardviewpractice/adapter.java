package com.example.cardviewpractice;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.viewholder> {

    private final Context context;
    private final ArrayList<modelclass> mylist;

    public adapter(Context context, ArrayList<modelclass> mylist) {
        this.context = context;
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //here things are created
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        //here created things are displayed
        modelclass model = mylist.get(position);
        holder.name.setText(model.getName());
        holder.img.setImageResource(model.getImg());
    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        private final ImageView img;
        private final TextView name;

        public viewholder(@NonNull View itemView) {
            super(itemView);


            img=itemView.findViewById(R.id.cardviewimage);
            name=itemView.findViewById(R.id.cardviewtext1);
        }
    }
}