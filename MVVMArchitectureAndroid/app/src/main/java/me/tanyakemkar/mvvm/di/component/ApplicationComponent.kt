package me.tanyakemkar.mvvm.di.component

import android.content.Context
import dagger.Component
import me.tanyakemkar.mvvm.data.api.NetworkService
import me.tanyakemkar.mvvm.data.repository.TopHeadlineRepository
import me.tanyakemkar.mvvm.di.module.ApplicationContext
import me.tanyakemkar.mvvm.di.module.ApplicationModule
import me.tanyakemkar.mvvm.utils.MVVMApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MVVMApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}
