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
import com.kamal.co777682_w2020_mad3125_fp.Models.Bill;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.R;
import com.kamal.co777682_w2020_mad3125_fp.UI.ShowBillDetailsActivity;

import java.util.ArrayList;

public class ShowBillListAdapter extends  RecyclerView.Adapter<ShowBillListAdapter.ShowBillViewHolder>
{
    private final ArrayList<Bill> billArrayList;
    public ShowBillListAdapter(ArrayList<Bill> billArrayList)
    {
        this.billArrayList = billArrayList;
    }


    @NonNull
    @Override
    public ShowBillListAdapter.ShowBillViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.bill_details,parent,false);
        ShowBillViewHolder showBillViewHolder = new ShowBillViewHolder(mView);
        return showBillViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ShowBillViewHolder holder, final int position) {
        Bill mbill = this.billArrayList.get(position);
        holder.billType.setText(mbill.getBillType());
        holder.billDate.setText(mbill.getBillDate());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bill mbill = billArrayList.get(position);
                Toast.makeText(holder.itemView.getContext(), mbill.getBillId(),Toast.LENGTH_SHORT).show();
                Intent mIntent= new Intent(holder.itemView.getContext(), ShowBillDetailsActivity.class);
                holder.itemView.getContext().startActivity(mIntent.putExtra("billObj",mbill));

            }
        });

    }
    public int getItemCount() {
        return this.billArrayList.size();
    }

    public class ShowBillViewHolder extends RecyclerView.ViewHolder {
        TextView billType;
        TextView billDate;

        public ShowBillViewHolder(@NonNull View itemView) {
            super(itemView);
            billType = itemView.findViewById(R.id.textView);

            billDate = itemView.findViewById(R.id.textView2);
        }
    }


}

