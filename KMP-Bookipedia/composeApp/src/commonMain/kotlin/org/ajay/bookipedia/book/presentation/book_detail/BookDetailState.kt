package org.ajay.bookipedia.book.presentation.book_detail

import org.ajay.bookipedia.book.domain.Book


data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)
