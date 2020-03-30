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

    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.latout_parts,null);
        ProductViewHolder holder = new ProductViewHolder(view);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);

        holder.headingparts.setText(product.getHeadingparts());
        holder.subheadingparts.setText(product.getSubheadingparts());
        holder.sideheadingparts.setText(product.getSideheadingparts());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView headingparts, subheadingparts, sideheadingparts;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            headingparts = itemView.findViewById(R.id.headingparts);
            subheadingparts = itemView.findViewById(R.id.subheadingparts);
            sideheadingparts = itemView.findViewById(R.id.sideheadingparts);

        }
    }
}
