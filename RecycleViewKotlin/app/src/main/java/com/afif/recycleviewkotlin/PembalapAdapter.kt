package com.afif.recycleviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PembalapAdapter(private val contex: Context, private val  pembalap: List<Pembalap>, val listener: (Pembalap) -> Unit)
    :RecyclerView.Adapter<PembalapAdapter.PembbalapViewHolder>(){

    class PembbalapViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgPembalap = view.findViewById<ImageView>(R.id.img_item_photo)
        val namePembalap = view.findViewById<TextView>(R.id.tv_item_name)
        val descPembalap = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(pembalap: Pembalap, listener: (Pembalap) -> Unit){
            imgPembalap.setImageResource(pembalap.imgPembalap)
            namePembalap.text = pembalap.namePembalap
            descPembalap.text = pembalap.descPembalap
            itemView.setOnClickListener {
                listener(pembalap)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PembbalapViewHolder {
        return PembbalapViewHolder(
            LayoutInflater.from(contex).inflate(R.layout.item_pembalap, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PembbalapViewHolder, position: Int) {
        holder.bindView(pembalap[position], listener)
    }

    override fun getItemCount(): Int = pembalap.size

    }