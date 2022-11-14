package com.example.remember;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Singer> mSinger;
    // Lưu Context để dễ dàng truy cập
    private Context mContext;

    public Adapter(List<Singer> singers, Context mContext) {
        this.mSinger = singers;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.singer_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Singer singer =mSinger.get(position);
        holder.ten.setText(singer.getTen());
        holder.nghedanh.setText(singer.getNghedanh());
        holder.quocgia.setText(singer.getQuocgia());
        holder.sao.setText(singer.getSao());
        holder.hinh.setImageResource(singer.getHinh());
    }

    @Override
    public int getItemCount() {
        return mSinger.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView ten;
        public TextView nghedanh;
        public TextView quocgia;
        public TextView sao;
        public ImageView hinh;

        public ViewHolder(View itemView) {
            super(itemView);
            ten = itemView.findViewById(R.id.ten);
            nghedanh = itemView.findViewById(R.id.nghedanh);
            quocgia = itemView.findViewById(R.id.quocgia);
            sao = itemView.findViewById(R.id.sao);
            hinh = itemView.findViewById(R.id.hinh);


            //Xử lý khi nút Chi tiết được bấm

        }
    }


}