package com.example.projectandroid.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectandroid.R
import com.example.projectandroid.model.Machin
import kotlinx.android.synthetic.main.item_machin.view.*

class MachinAdapter(
    private val myDataset: MutableList<Machin>,
    private val onClickListener: (View, Machin) -> Unit
)  : RecyclerView.Adapter<MachinAdapter.MachinViewHolder>() {

    class MachinViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val _label = itemView.item_machin_label
        val _desc = itemView.item_machin_desc
        val _avatar = itemView.item_machin_avatar
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MachinViewHolder {
        var itemView =
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_machin, parent, false)
                    as View
        return MachinViewHolder(itemView) // Dans le return vous construisez un ViewHolder tel que vous l'avez défini au  dessus.
    }

    override fun onBindViewHolder(holder: MachinViewHolder, position: Int) {
        holder._label.text = myDataset[position].main
        holder._desc.text = myDataset[position].email
        Glide.with(holder._avatar.context).load(myDataset[position].avatar).into(holder._avatar)

        holder._avatar.setOnClickListener { view ->
            onClickListener(view, myDataset[position])
        }
    }

    override fun getItemCount() = myDataset.size
}
