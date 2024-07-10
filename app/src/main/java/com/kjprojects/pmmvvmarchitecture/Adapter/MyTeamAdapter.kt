package com.kjprojects.pmmvvmarchitecture.Adapter
import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.kjprojects.pmmvvmarchitecture.Domain.OngoingDomain
import com.kjprojects.pmmvvmarchitecture.R

class MyTeamAdapter(private val items:List<OngoingDomain>):RecyclerView.Adapter<MyTeamAdapter.Viewholder>() {
    inner class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title:TextView=itemView.findViewById(R.id.titleTxt)
        val data:TextView=itemView.findViewById(R.id.dateTxt)
        val progressPercent:TextView=itemView.findViewById(R.id.percentageTxt)
        val progressTxt:TextView=itemView.findViewById(R.id.progTxt)
        val progressBar:ProgressBar=itemView.findViewById(R.id.progressBar)
        val pic:ImageView=itemView.findViewById(R.id.pic)
        val layout:ConstraintLayout=itemView.findViewById(R.id.layout)

        fun setTextColors(colorRes: Int){
            title.setTextColor(itemView.context.getColor(colorRes))
            data.setTextColor(itemView.context.getColor(colorRes))
            progressTxt.setTextColor(itemView.context.getColor(colorRes))
            progressPercent.setTextColor(itemView.context.getColor(colorRes))
            pic.setColorFilter(ContextCompat.getColor(itemView.context,colorRes), PorterDuff.Mode.SRC_IN)
            progressBar.progressTintList= ColorStateList.valueOf(ContextCompat.getColor(itemView.context,colorRes))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_ongoing,parent,false)
        return Viewholder(view)
    }

    override fun getItemCount(): Int = items.size


    @SuppressLint("SetTextI18n", "DiscouragedApi")
    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val item = items[position]
        holder.title.text=item.title
        holder.data.text=item.data
        holder.progressPercent.text= "${item.progressPercent}%"


        val drawableResourceId=holder.itemView.context.resources.getIdentifier(
            item.picPath,"drawable",holder.itemView.context.packageName)

        Glide.with(holder.itemView.context).load(drawableResourceId).into(holder.pic)
        //31.42 error


        holder.progressBar.progress=item.progressPercent
        with(holder){
            if(position==0){
                layout.setBackgroundResource(R.drawable.dark_bg)
                setTextColors(R.color.white)
            }else{
                layout.setBackgroundResource(R.drawable.light_purple_background)
                setTextColors(R.color.dark_purple)
            }
        }
    }
}

//1:01:52 sambung

