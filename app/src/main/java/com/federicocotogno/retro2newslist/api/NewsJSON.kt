package com.federicocotogno.retro2newslist.api

data class NewsJSON(
    val news: List<New>,
    val page: Int,
    val status: String
)