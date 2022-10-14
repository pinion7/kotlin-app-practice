package com.group.libraryapp.dto.user.response

import com.group.libraryapp.domain.user.User

class UserResponse(
    val id: Long,
    val name: String,
    val age: Int?,
) {

    // 1. 정적 팩토리 메소드 방식 : 더 추천!
    companion object {
        fun of(user: User): UserResponse {
            return UserResponse(
                id = user.id!!,
                name = user.name,
                age = user.age
            )
        }
    }

    // 2. 부 생성자 방식
//    constructor(user: User): this(
//        id = user.id!!,
//        name = user.name,
//        age = user.age
//    )
}