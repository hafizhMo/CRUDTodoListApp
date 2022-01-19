package com.hafizhmo.crudtodolistapp.di

import android.app.Application
import androidx.room.Room
import com.hafizhmo.crudtodolistapp.data.TodoDatabase
import com.hafizhmo.crudtodolistapp.data.TodoRepository
import com.hafizhmo.crudtodolistapp.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo)db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository{
        return TodoRepositoryImpl(db.dao)
    }
}