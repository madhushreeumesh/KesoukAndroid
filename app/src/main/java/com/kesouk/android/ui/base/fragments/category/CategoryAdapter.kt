package com.kesouk.android.ui.base.fragments.category

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kesouk.android.R

class CategoryAdapter(internal var mCtx: Context, private val productList: List<Category>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.category_items, parent, false)
        mCtx = parent.context
        return CategoryViewHolder(v)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

        val product = productList[position]
        holder.image.setImageResource(product.image)
        holder.textView.text = product.textView
        holder.image1.setImageResource(product.image2)

        }

    override fun getItemCount(): Int {
        return productList.size
    }


     class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var textView: TextView
        internal var image: ImageView
        internal var image1: ImageView

        init {
            image = itemView.findViewById(R.id.prod_image)
            textView = itemView.findViewById(R.id.tv_submenu1)
            image1 = itemView.findViewById(R.id.dropdown)
        }
    }
}

