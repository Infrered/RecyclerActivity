package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter: RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    class NumberViewHolder (val _textView: TextView) : RecyclerView.ViewHolder(_textView) {
        val textView = _textView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


    override fun getItemCount(): Int {

    }

    //Step 3b: Complete function definitions for adapter

}