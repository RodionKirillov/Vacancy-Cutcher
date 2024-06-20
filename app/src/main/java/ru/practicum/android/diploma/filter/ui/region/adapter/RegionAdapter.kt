package ru.practicum.android.diploma.filter.ui.region.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.practicum.android.diploma.databinding.ViewItemForwardBtnBinding
import ru.practicum.android.diploma.filter.domain.models.Region

class RegionAdapter(
    private var onItemClickListener: ((Region) -> Unit)
) : RecyclerView.Adapter<RegionViewHolder>() {

    var content = mutableListOf<Region>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegionViewHolder {
        val layoutInspector = LayoutInflater.from(parent.context)
        return RegionViewHolder(ViewItemForwardBtnBinding.inflate(layoutInspector, parent, false))
    }

    override fun getItemCount() = content.size

    override fun onBindViewHolder(holder: RegionViewHolder, position: Int) {
        holder.bind(content[position])
        holder.itemView.setOnClickListener { _ ->
            onItemClickListener.invoke(content[holder.adapterPosition])
        }
    }
}
