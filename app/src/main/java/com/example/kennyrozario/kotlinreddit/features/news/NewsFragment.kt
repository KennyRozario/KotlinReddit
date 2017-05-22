package com.example.kennyrozario.kotlinreddit.features.news

import com.example.kennyrozario.kotlinreddit.commons.RedditNewsItem
import com.example.kennyrozario.kotlinreddit.commons.extensions.inflate
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.kennyrozario.kotlinreddit.R.layout.news_fragment
import kotlinx.android.synthetic.main.news_fragment.*

/**
 * Created by Kenny on 2017-05-21.
 */
class NewsFragment : android.support.v4.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(news_fragment)
    }

    override fun onActivityCreated(savedInstanceState: android.os.Bundle?) {
        super.onActivityCreated(savedInstanceState)

        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)

        initAdapter()

        if (savedInstanceState == null) {
            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..10) {
                news.add(RedditNewsItem(
                        "author$i",
                        "Title $i",
                        i,
                        1457207701L - i * 200,
                        "http://lorempixel.com/200/200/technics/$i",
                        "url"
                ))
            }
            (news_list.adapter as NewsAdapter).addNews(news)
        }
    }

    private fun initAdapter() {
        if (news_list.adapter == null) {
            news_list.adapter = NewsAdapter()
        }
    }
}