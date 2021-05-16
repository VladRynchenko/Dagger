package com.example.android.dagger.di

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

@Subcomponent
interface UserComponents {

    @Subcomponent.Factory
    interface Factory{
        fun create(): UserComponents
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)

}