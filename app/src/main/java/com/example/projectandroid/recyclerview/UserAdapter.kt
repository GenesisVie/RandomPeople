package com.example.projectandroid.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectandroid.R
import com.example.projectandroid.model.userApi.Users
import kotlinx.android.synthetic.main.item_machin.view.*

class UserAdapter(private val myDataset: MutableList<Users>)  : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val _label = itemView.item_machin_label
        val _desc = itemView.item_machin_desc
//        val _avatar = itemView.item_machin_avatar
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): UserViewHolder {
        var itemView =
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_machin, parent, false)
                    as View
        return UserViewHolder(itemView) // Dans le return vous construisez un ViewHolder tel que vous l'avez défini au  dessus.
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder._label.text = myDataset[position].login.username
        holder._desc.text = myDataset[position].email
    }

    override fun getItemCount() = myDataset.size
}
