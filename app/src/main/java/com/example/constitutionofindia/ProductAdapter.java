package com.example.constitutionofindia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends  RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    private Context mCtx;
    private List<Product> productList;
    private itemClickListener clickListener;

    public ProductAdapter(Context mCtx, List<Product> productList, itemClickListener clickListener) {
        this.mCtx = mCtx;
        this.productList = productList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.latout_parts,null);
        ProductViewHolder holder = new ProductViewHolder(view,clickListener);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);

        holder.headingparts.setText(product.getHeadingparts());
        holder.subheadingparts.setText(product.getSubheadingparts());
        holder.sideheadingparts2.setText(product.getSideheadingparts2());

    }



    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView headingparts, subheadingparts,sideheadingparts2;
        itemClickListener itemClickListener;

        public ProductViewHolder(@NonNull View itemView,itemClickListener itemClickListener) {
            super(itemView);

            headingparts = itemView.findViewById(R.id.headingparts);
            subheadingparts = itemView.findViewById(R.id.subheadingparts);
            sideheadingparts2= itemView.findViewById(R.id.sideheadingparts2);
            this.itemClickListener = itemClickListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.itemClickListener(getAdapterPosition());
        }
    }

    public interface itemClickListener {
        void itemClickListener(int position);
    }
}
