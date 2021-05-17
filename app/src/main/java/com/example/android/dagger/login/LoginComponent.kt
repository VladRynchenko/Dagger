package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.registration.RegistrationComponent
import dagger.Component
import dagger.Subcomponent

@Subcomponent
@ActivityScope
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)
}