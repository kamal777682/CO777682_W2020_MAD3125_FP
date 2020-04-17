package com.kamal.co777682_w2020_mad3125_fp.Adapters;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.R;
import com.kamal.co777682_w2020_mad3125_fp.UI.CustomerListActivity;

import java.util.ArrayList;

public class CustomerListAdapter extends  RecyclerView.Adapter<CustomerListAdapter.CustomersViewHolder>
{

    private final ArrayList<Customers> customerArrayList;

    @NonNull
    @Override
    public CustomersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_list,parent,false);
        CustomersViewHolder customersViewHolder = new CustomersViewHolder(mView);
        return customersViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomersViewHolder holder, int position) {
        final Customers mCustomers = this.customerArrayList.get(position);
        holder.txtName.setText(mCustomers.getFullName());
        holder.email.setText(mCustomers.getEmail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), mCustomers.getFirtName(),Toast.LENGTH_SHORT).show();
                Log.d("CLICK","hello");
                Intent mIntent= new Intent(holder.itemView.getContext(), CustomerListActivity.class);
                holder.itemView.getContext().startActivity(mIntent.putExtra("CustomersObj",mCustomers));

            }
        });

    }

    @Override
    public int getItemCount() {
        return this.customerArrayList.size();
    }

    public class CustomersViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView email;
        ImageView img;
        public CustomersViewHolder(@NonNull View itemView) {
            super(itemView);

                txtName = itemView.findViewById(R.id.txtName);
                email = itemView.findViewById(R.id.txtEmail);
                img = itemView.findViewById(R.id.img);
            }
        }
        public CustomerListAdapter(ArrayList<Customers> customerArrayList)
        {
            this.customerArrayList = customerArrayList;
        }
 }

