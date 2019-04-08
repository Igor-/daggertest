package com.example.daggertest.di

import com.example.daggertest.MainActivity
import com.example.daggertest.utils.DateUtils
import dagger.Component

@Component(modules = [(AppUtilsModule::class)])
interface DateUtilsSuperComponent {
    fun inject(dateUtils: DateUtils)
}