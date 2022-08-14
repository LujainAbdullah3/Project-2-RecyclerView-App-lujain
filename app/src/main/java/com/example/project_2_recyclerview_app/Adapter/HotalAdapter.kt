package com.example.project_2_recyclerview_app.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.Model.Hotal
import android.content.Context
import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.Data.dataSource


class HotalAdapter(private val dataset : List<Hotal>,  private val context: Context)
    : RecyclerView.Adapter<HotalAdapter.HotalViewHolder>(){


    class HotalViewHolder(private val  view :View)
        :RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
        val textView1 : TextView = view.findViewById(R.id.item_title1)
        val imageView1 : ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotalViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return HotalViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: HotalViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text= context.resources.getString(item.hotalStringId)
        holder.imageView.setImageResource(item.hotalImageId)
        holder.textView1.text= context.resources.getString(item.hotalStringId1)
        holder.imageView1.setImageResource(item.hotalImageId1)

    }

    override fun getItemCount(): Int = dataset.size
}