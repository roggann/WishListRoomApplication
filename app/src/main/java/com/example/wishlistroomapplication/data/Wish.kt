package com.example.wishlistroomapplication.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = "",
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Apple watch", description = "this is my dummy wish"),
        Wish(title = "Apple watch 1", description = "this is my dummy wish 1"),
        Wish(title = "Apple watch 2", description = "this is my dummy wish 2"),
        Wish(title = "Apple watch 3", description = "this is my dummy wish 3"),
    )
}
