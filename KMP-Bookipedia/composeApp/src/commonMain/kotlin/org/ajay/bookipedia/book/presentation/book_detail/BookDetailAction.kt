package org.ajay.bookipedia.book.presentation.book_detail

import org.ajay.bookipedia.book.domain.Book


sealed interface BookDetailAction {
    data object OnBackClick: BookDetailAction
    data object OnFavoriteClick: BookDetailAction
    data class OnSelectedBookChange(val book: Book): BookDetailAction
}