package com.example.nttdatabootcamp.viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import nttdatabootcamp.R

class ContactAdapter(val contactList: ArrayList<Contact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactList[position])
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {

        fun bindItem(contact : Contact){

            val textName = itemView.findViewById<TextView>(R.id.contactName)
            val textPhone = itemView.findViewById<TextView>(R.id.contactPhone)

            textName.text = contact.name
            textPhone.text = contact.phoneNumber

        }

    }
}