package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*


class UserAdapter :RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private lateinit var listUser: List<User>

    private fun setData(listUser: List<User> ){
        this.listUser=listUser
        notifyDataSetChanged()
    }

    inner class UserViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        TODO("Not yet implemented")
        var view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        TODO("Not yet implemented")
        var user:User=listUser.get(position)
        if (user==null){
            return
        }
        holder.itemView.apply {
            tvUsername.text=user.UserName
            tvAddress.text=user.Address
        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        if(listUser!=null){
            return listUser.size
        }
        return 0;
    }
}