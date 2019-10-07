package com.anupkumar.rxjavanetworking

data class User(var id: Long = 0L,
                var firstname: String,
                var lastname: String,
                var isFollowing: Boolean = false)