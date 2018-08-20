package com.example.packdel.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;

    private List<Contact> contactList;

    public RecyclerViewAdapter(Context context, List<Contact> contactList){

        this.context = context;

        this.contactList = contactList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;

        v = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.name_tv.setText(contactList.get(position).getName());

        holder.number_tv.setText(contactList.get(position).getNumber());

        holder.image_iv.setImageResource(contactList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name_tv;

        TextView number_tv;

        ImageView image_iv;


        MyViewHolder(View itemView) {
            super(itemView);

            name_tv = (TextView) itemView.findViewById(R.id.name);

            number_tv = (TextView) itemView.findViewById(R.id.number);

            image_iv = (ImageView) itemView.findViewById(R.id.img);

        }
    }
}
