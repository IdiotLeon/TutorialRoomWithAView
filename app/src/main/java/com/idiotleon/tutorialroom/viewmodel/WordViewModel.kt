package com.idiotleon.tutorialroom.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.idiotleon.tutorialroom.model.Word
import com.idiotleon.tutorialroom.repository.WordRepository

class WordViewModel(
    application: Application
) : AndroidViewModel(application) {

    private val repository: WordRepository = WordRepository(application)
    private val allWords: LiveData<List<Word>> = repository.getAllWords()

    fun getAllWords(): LiveData<List<Word>> = allWords
    fun insert(word: Word) = repository.insert(word)
}