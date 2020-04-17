package com.kamal.co777682_w2020_mad3125_fp.Adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomerListAdapter extends  RecyclerView.Adapter<CustomerListAdapter.CustomersViewHolder>
{

    @NonNull
    @Override
    public CustomersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomersViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CustomersViewHolder extends RecyclerView.ViewHolder {
        public CustomersViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
