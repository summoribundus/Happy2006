package com.example.tryonlysports.ui.sportsResult

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tryonlysports.ui.sports.DoingSportsViewModel
import com.google.firebase.firestore.FirebaseFirestore
import java.lang.IllegalArgumentException

/**
 * This is the Sports Result ViewModelFactory which instantiates and returns the ViewModel object that survives configuration changes of Sports Results fragment.
 *
 * @property type workout type. (e.g. walking/jogging/cycling)
 * @property passedTime the time duration of the workout.
 * @property totalDistance the total distance of the workout.
 * @property db the firebase database instance.
 * @property username the username.
 *
 * @author Ye Ziyuan
 */
class SportsResultViewModelFactory(val type: String,
                                   val passedTime: Long,
                                   val totalDistance: Double,
val db: FirebaseFirestore, val username: String): ViewModelProvider.Factory {
    /**
     * Creates ViewModel for Sports Results Fragment and passes the type & time duration & total distance.
     *
     * @param T ViewModel type.
     * @param modelClass general type of model class that we are going to assign.
     * @return the created SportsResultViewModel given the workout type.
     */
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SportsResultViewModel::class.java)) {
            return SportsResultViewModel(type, passedTime, totalDistance, db, username) as T
        }
        throw IllegalArgumentException("Unknown view class")
    }
}