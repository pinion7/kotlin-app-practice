package com.group.libraryapp.domain.book

import java.util.Optional
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository: JpaRepository<Book, Long> {

    fun findByName(bookName: String): Optional<Book>
}