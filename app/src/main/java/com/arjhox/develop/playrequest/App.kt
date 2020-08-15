package com.arjhox.develop.playrequest

import android.app.Application
import com.arjhox.develop.data.services.dataModule
import com.arjhox.develop.playrequest.ui.main.play.playModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
    }


    private fun initKoin() {
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(
                listOf(
                    dataModule,
                    playModule
                )
            )
        }
    }

}