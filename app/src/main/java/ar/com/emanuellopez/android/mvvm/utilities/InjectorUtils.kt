package ar.com.emanuellopez.android.mvvm.utilities

import ar.com.emanuellopez.android.mvvm.data.FakeDatabase
import ar.com.emanuellopez.android.mvvm.data.QuoteRepository
import ar.com.emanuellopez.android.mvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return  QuotesViewModelFactory(quoteRepository)
    }
}