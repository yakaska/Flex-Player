package ru.valentine.flexplayer

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import ru.valentine.flexplayer.injection.*
import timber.log.Timber

class FlexPlayerApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        startKoin {
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(this@FlexPlayerApp)
            modules(
                listOf(
                    repositoryModule,
                    uiModule,
                    serviceModule,
                    repositoryModule,
                    networkModule,
                )
            )
        }
    }
}