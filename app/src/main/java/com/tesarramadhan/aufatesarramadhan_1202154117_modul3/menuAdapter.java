package com.tesarramadhan.aufatesarramadhan_1202154117_modul3;

/**
 * Created by Tesarramadhan on 2/25/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class menuAdapter extends RecyclerView.Adapter<menuAdapter.menuholder> {
    //deklarasi variable
    CardView cd;
    private Context context;
    private List<pilihAir> listmenu;

    //adapter menyiapkan layout untuk daftar menu
    public menuAdapter (Context context, List<pilihAir> listmenu){
        this.context = context;
        this.listmenu = listmenu;
    }

    @Override
    //membuat tampilan dan mengembalikannya
    public menuholder onCreateViewHolder(ViewGroup parent, int viewType) {
        //buat view baru
        View view = LayoutInflater.from(context).inflate(R.layout.menucv, parent, false);
        menuholder holder = new menuholder(view);
        return holder;
    }

    @Override
    //menghubungkan data dengan view holder pada posisi yang ditentukan
    public void onBindViewHolder (menuholder holder, int position) {
        pilihAir data = listmenu.get(position);
        //kondisi gambar dari drawable dijadikan sebagai background di cardview
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            holder.rl.setBackground(holder.rl.getResources().getDrawable(data.getFoto()));
        }
        //mengeset isi view dengan elemen dari data
        holder.rl.setTag(data.getFoto());
        holder.nama.setText(data.getNama());
        holder.detail.setText(data.getDetail());
    }

    @Override
    //menghitung jumlah data yang akan ditampilkan
    public int getItemCount() {
        return listmenu.size();
    }

    class menuholder extends RecyclerView.ViewHolder{
        //deklarasi variable
        RelativeLayout rl;
        TextView nama, detail;

        public menuholder(View itemView){
            super(itemView);
            //mengambil id yang ada di layout
            nama = itemView.findViewById(R.id.namaAir);
            detail = itemView.findViewById(R.id.detailAir);
            rl = itemView.findViewById(R.id.layout1);
            //implementasi onclicklistener
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //buat intent baru
                    Intent ganti = new Intent(context, DetailAir.class);
                    //mengirimkan data yang duambil ke detail air
                    ganti.putExtra("nama", nama.getText());
                    ganti.putExtra("detail", detail.getText());
                    ganti.putExtra("foto", rl.getTag().toString());
                    //eksekusi intent
                    context.startActivity(ganti);
                }
            });
        }
    }
}

