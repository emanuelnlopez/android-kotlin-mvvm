package ar.com.emanuellopez.android.mvvm.ui.quotes

import androidx.lifecycle.ViewModel
import ar.com.emanuellopez.android.mvvm.data.Quote
import ar.com.emanuellopez.android.mvvm.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

}