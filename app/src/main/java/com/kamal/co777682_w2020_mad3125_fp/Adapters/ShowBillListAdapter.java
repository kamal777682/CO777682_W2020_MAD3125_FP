package com.kamal.co777682_w2020_mad3125_fp.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;
import com.kamal.co777682_w2020_mad3125_fp.Models.Bill;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.R;
import com.kamal.co777682_w2020_mad3125_fp.UI.ShowBillDetailsActivity;

import java.util.ArrayList;

public class ShowBillListAdapter extends  RecyclerView.Adapter<ShowBillListAdapter.ShowBillViewHolder>
{
    private final ArrayList<Customers> billArrayList;
    public ShowBillListAdapter(ArrayList<Customers> billArrayList)
    {
        this.billArrayList = billArrayList;
    }


    @NonNull
    @Override
    public ShowBillListAdapter.ShowBillViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_list,parent,false);
        ShowBillListAdapter.ShowBillViewHolder showBillViewHolder = new ShowBillListAdapter.ShowBillViewHolder(mView);
        return showBillViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ShowBillViewHolder holder, final int position) {
        Customers mCustomers = this.billArrayList.get(position);
        holder.txtName.setText(mCustomers.getFullName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Customers mCustomers = billArrayList.get(position);
                Toast.makeText(holder.itemView.getContext(), mCustomers.getFullName(),Toast.LENGTH_SHORT).show();
                Intent mIntent= new Intent(holder.itemView.getContext(), ShowBillDetailsActivity.class);holder.itemView.getContext().startActivity(mIntent.putExtra("CustomersObj",mCustomers));

            }
        });

    }
    public int getItemCount() {
        return this.billArrayList.size();
    }

    public class ShowBillViewHolder extends RecyclerView.ViewHolder {
        TextInputEditText txtName;

        public ShowBillViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}

