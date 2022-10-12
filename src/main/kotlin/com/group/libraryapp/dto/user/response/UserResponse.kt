package com.group.libraryapp.dto.user.response

import com.group.libraryapp.domain.user.User

class UserResponse(user: User) {
    val id: Long
    val name: String
    val age: Int?

    init {
        id = user.id!!
        name = user.name
        age = user.age
    }
}