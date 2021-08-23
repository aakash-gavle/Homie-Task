package com.example.homie.ui.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homie.R


class TagsAdapter(
    private val context: Activity,
    private var tagsList: ArrayList<String>,
    private val tagClickListener: TagClickListener
) :
    RecyclerView.Adapter<TagsViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TagsViewHolder {

        return TagsViewHolder(context.layoutInflater.inflate(R.layout.item_tags, parent, false))

    }

    override fun getItemCount(): Int {
        return tagsList.size
    }

    override fun onBindViewHolder(holder: TagsViewHolder, position: Int) {

        holder.tagsTextView.text = tagsList[position].trim()
        holder.itemView.setOnClickListener {
            tagClickListener.onTagClickListener(tagsList[position])
        }
    }
}

class TagsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val tagsTextView: TextView = view.findViewById(R.id.tv_tag)

}

interface TagClickListener {
    fun onTagClickListener(tag: String)
}


