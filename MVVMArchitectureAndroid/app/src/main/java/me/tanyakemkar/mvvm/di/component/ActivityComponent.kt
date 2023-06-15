package me.tanyakemkar.mvvm.di.component

import dagger.Component
import me.tanyakemkar.mvvm.di.module.ActivityModule
import me.tanyakemkar.mvvm.di.module.ActivityScope

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}
