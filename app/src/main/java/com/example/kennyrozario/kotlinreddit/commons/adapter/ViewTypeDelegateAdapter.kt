package com.example.kennyrozario.kotlinreddit.commons.adapter

/**
 * Created by Kenny on 2017-05-21.
 */
interface ViewTypeDelegateAdapter {
    fun onCreateViewHolder(parent: android.view.ViewGroup): android.support.v7.widget.RecyclerView.ViewHolder

    fun onBindViewHolder(holder: android.support.v7.widget.RecyclerView.ViewHolder, item: ViewType)
}