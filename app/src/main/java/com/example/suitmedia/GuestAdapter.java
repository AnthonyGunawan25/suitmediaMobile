package com.example.suitmedia;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class GuestAdapter extends RecyclerView.Adapter<GuestAdapter.ViewHolder> {

    Context ctx;
    List<Guest> listGuest;

    public GuestAdapter(Context ctx) {
        this.ctx = ctx;
        this.listGuest = new ArrayList<>();
    }

    public void setListGuest(List<Guest> listGuest){
        this.listGuest = listGuest;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.row_quest, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Guest guest = listGuest.get(position);
    //    holder.ivThumbnail.setImageResource(book.thumbnail);

        holder.guestName.setText(guest.nama);
        holder.guestDOB.setText(guest.birthday);
    }

    @Override
    public int getItemCount() {
        return listGuest.size();
    }

     class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView guestName;
        TextView guestDOB;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            guestName = itemView.findViewById(R.id.guestName);
            guestDOB = itemView.findViewById(R.id.guestDOB);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Guest guest = listGuest.get(position);
        }
    }
}