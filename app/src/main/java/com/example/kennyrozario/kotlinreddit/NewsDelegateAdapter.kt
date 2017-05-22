package com.example.kennyrozario.kotlinreddit

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.kennyrozario.kotlinreddit.commons.RedditNewsItem
import com.example.kennyrozario.kotlinreddit.commons.adapter.ViewType
import com.example.kennyrozario.kotlinreddit.commons.adapter.ViewTypeDelegateAdapter
import com.example.kennyrozario.kotlinreddit.commons.extensions.getFriendlyTime
import com.example.kennyrozario.kotlinreddit.commons.extensions.inflate
import com.example.kennyrozario.kotlinreddit.commons.extensions.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by Kenny on 2017-05-21.
 */
class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}