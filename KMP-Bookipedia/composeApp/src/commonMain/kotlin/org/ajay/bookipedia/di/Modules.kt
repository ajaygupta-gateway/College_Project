package org.ajay.bookipedia.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import org.ajay.bookipedia.book.data.database.DatabaseFactory
import org.ajay.bookipedia.book.data.database.FavoriteBookDatabase
import org.ajay.bookipedia.book.data.network.KtorRemoteBookDataSource
import org.ajay.bookipedia.book.data.network.RemoteBookDataSource
import org.ajay.bookipedia.book.data.repository.DefaultBookRepository
import org.ajay.bookipedia.book.domain.BookRepository
import org.ajay.bookipedia.book.presentation.SelectedBookViewModel
import org.ajay.bookipedia.book.presentation.book_detail.BookDetailViewModel
import org.ajay.bookipedia.book.presentation.book_list.BookListViewModel
import org.ajay.bookipedia.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }
    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}