package com.example.daggertest.di

import com.example.daggertest.utils.DateUtils
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppUtilsModule {
    @Provides
    @Singleton
    fun provideDateutils() : DateUtils = DateUtils()
}