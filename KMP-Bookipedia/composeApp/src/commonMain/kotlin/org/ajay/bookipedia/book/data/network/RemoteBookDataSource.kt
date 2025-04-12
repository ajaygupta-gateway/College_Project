package org.ajay.bookipedia.book.data.network

import org.ajay.bookipedia.book.data.dto.BookWorkDto
import org.ajay.bookipedia.book.data.dto.SearchResponseDto
import org.ajay.bookipedia.core.domain.DataError
import org.ajay.bookipedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}