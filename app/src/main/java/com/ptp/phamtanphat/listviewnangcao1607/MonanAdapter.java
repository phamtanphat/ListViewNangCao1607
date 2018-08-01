package com.ptp.phamtanphat.listviewnangcao1607;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonanAdapter extends ArrayAdapter<Monan> {


    public MonanAdapter(@NonNull Context context, int resource, @NonNull List<Monan> objects) {
        super(context, resource, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Xu ly ve giao dien cho moi item
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.dong_item_monan_listview,null);

        ImageView imageView = convertView.findViewById(R.id.imageviewMonan);
        TextView txtTen = convertView.findViewById(R.id.textviewTen);
        TextView txtGia = convertView.findViewById(R.id.textviewGia);

        Monan monan = getItem(position);

        imageView.setImageResource(monan.getHinhanh());
        txtTen.setText(monan.getTen());
        txtGia.setText(monan.getGia() + " Dong");
        return convertView;
    }
}
