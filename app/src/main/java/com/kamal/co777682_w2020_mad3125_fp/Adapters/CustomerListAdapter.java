package com.kamal.co777682_w2020_mad3125_fp.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.R;
import com.kamal.co777682_w2020_mad3125_fp.UI.BillSummaryActivity;
import com.kamal.co777682_w2020_mad3125_fp.UI.ShowBillDetailsActivity;

import java.util.ArrayList;

public class CustomerListAdapter extends  RecyclerView.Adapter<CustomerListAdapter.CustomersViewHolder>
{

    private  ArrayList<Customers> customerArrayList;
    public CustomerListAdapter(ArrayList<Customers> customerArrayList)
    {
        this.customerArrayList = customerArrayList;
    }
    @NonNull
    @Override
    public CustomersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_list,parent,false);
        CustomersViewHolder customersViewHolder = new CustomersViewHolder(mView);
        return customersViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomersViewHolder holder, final int position) {
        Customers mCustomers = this.customerArrayList.get(position);
        holder.txtName.setText(mCustomers.getFullName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Customers mCustomers = customerArrayList.get(position);
                Toast.makeText(holder.itemView.getContext(), mCustomers.getFullName(),Toast.LENGTH_SHORT).show();
                Intent mIntent= new Intent(holder.itemView.getContext(), ShowBillDetailsActivity.class);
                mIntent.putExtra("CustomerObj",position);
                holder.itemView.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.customerArrayList.size();
    }

    public class CustomersViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;

        public CustomersViewHolder(@NonNull View itemView) {
            super(itemView);

                txtName = itemView.findViewById(R.id.txtName);
            }
        }
     }

