package com.erikriosetiawan.bestlinuxdistros.adapter

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.erikriosetiawan.bestlinuxdistros.DetailsActivity
import com.erikriosetiawan.bestlinuxdistros.R
import com.erikriosetiawan.bestlinuxdistros.model.LinuxDistro
import com.squareup.picasso.Picasso

class LinuxDistrosAdapter(val linuxDistros: ArrayList<LinuxDistro>) :
        RecyclerView.Adapter<LinuxDistrosAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view: View = LayoutInflater.from(p0.context).inflate(R.layout.list_item, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return linuxDistros.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.tvName.text = linuxDistros[p1].distroName
        p0.tvDescription.text = linuxDistros[p1].description

        Picasso.get()
                .load(linuxDistros[p1].photos)
                .resize(150, 200)
                .into(p0.imgPhoto)

        p0.itemView.setOnClickListener {
            val dataIntent = Intent(p0.itemView.context, DetailsActivity::class.java)
            dataIntent.putExtra(DetailsActivity.DATA_KEY, linuxDistros[p1])
            p0.itemView.context.startActivity(dataIntent)
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_desc)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)
    }

}