package com.dpridoy.daggerpractice.di

import com.dpridoy.daggerpractice.retrofit.FakerAPI
import com.dpridoy.daggerpractice.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideFakerAPI(retrofit: Retrofit):FakerAPI{
        return retrofit.create(FakerAPI::class.java)
    }
}