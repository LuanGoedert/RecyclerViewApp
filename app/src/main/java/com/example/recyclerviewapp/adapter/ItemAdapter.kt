package com.example.recyclerviewapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.R
import com.example.recyclerviewapp.model.Affirmation

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */

class ItemAdapter(private val context: Context, private val dataSet: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    //     Provide a reference to the views for each data item
//     Complex data items may need more than one view per item, and
//     you provide access to all the views for a data item in a view holder.
//     Each data item is just an Affirmation object.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    //     Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutAdapter =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(layoutAdapter)
    }

    //    Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]

        holder.textView.text = context.resources.getString(item.stringResourceid)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    //    Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return dataSet.size
    }
}