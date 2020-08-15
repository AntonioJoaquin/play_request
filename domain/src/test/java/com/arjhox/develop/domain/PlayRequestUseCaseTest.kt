package com.arjhox.develop.domain

import com.arjhox.develop.domain.repositories.RequestRepository
import com.arjhox.develop.domain.usecases.PlayRequestUseCase
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Test

class PlayRequestUseCaseTest {

    private lateinit var requestRepository: RequestRepository
    private lateinit var playRequestUseCase: PlayRequestUseCase


    @Before
    fun setUp() {
        this.requestRepository = mock()
        this.playRequestUseCase = PlayRequestUseCase(requestRepository)
    }


    @Test
    fun `playRequest from use case should call playRequest from requestRepository`() {
        val url = "example"

        playRequestUseCase.playRequest(url)

        verify(requestRepository).playRequest(url)
    }

}