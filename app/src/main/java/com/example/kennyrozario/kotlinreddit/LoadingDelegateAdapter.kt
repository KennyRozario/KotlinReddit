package com.example.kennyrozario.kotlinreddit

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.kennyrozario.kotlinreddit.commons.adapter.ViewType
import com.example.kennyrozario.kotlinreddit.commons.adapter.ViewTypeDelegateAdapter
import com.example.kennyrozario.kotlinreddit.commons.extensions.inflate

/**
 * Created by Kenny on 2017-05-21.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder (
            parent.inflate(R.layout.news_item_loading))

}