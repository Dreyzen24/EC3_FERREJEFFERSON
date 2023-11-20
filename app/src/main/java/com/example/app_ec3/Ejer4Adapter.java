package com.example.app_ec3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_ec3.databinding.ItemMascotasBinding;

import java.util.ArrayList;

public class Ejer4Adapter extends RecyclerView.Adapter<Ejer4Adapter.ViewHolder>{


    private ArrayList<Ejer4> lista = new ArrayList<>();
    @NonNull
    @Override
    public Ejer4Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder( ItemMascotasBinding
                .inflate(LayoutInflater.from(parent.getContext())
                        ,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Ejer4 objjer4 = lista.get(position);
        holder.binding. iv.setImageResource(objjer4.getImagen());
        holder.binding.tvNombre.setText(objjer4.getNombre());
        holder.binding.tvversion.setText(objjer4.getDireccion());
        holder.binding.tvversion.setText(objjer4.getEstado());

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemMascotasBinding binding;
        public ViewHolder(ItemMascotasBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
