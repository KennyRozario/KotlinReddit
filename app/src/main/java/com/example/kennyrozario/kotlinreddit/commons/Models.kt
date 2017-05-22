package com.example.kennyrozario.kotlinreddit.commons

import com.example.kennyrozario.kotlinreddit.commons.adapter.AdapterConstants
import com.example.kennyrozario.kotlinreddit.commons.adapter.ViewType

/**
 * Created by Kenny on 2017-05-21.
 */
data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}