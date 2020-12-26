package com.example.valarmorghulis.firebaseauth;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.provider.PicassoProvider;

public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    View mView;
    public ViewHolder(View itemView){
        super(itemView);
    }
    public void setDetails(Context ctx, String title, String image){
        TextView mtitle= mView.findViewById(R.id.rTitleTv);
        ImageView mimage= mView.findViewById(R.id.rImageView);
        mtitle.setText(title);
        PicassoProvider.get().load(image).into(mimage);

            }
}
