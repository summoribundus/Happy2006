package com.example.tryonlysports.ui.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.firestore.FirebaseFirestore
import java.lang.IllegalArgumentException

/**
 * This is the PersonalInfoHistory ViewModelFactory which instantiates and returns the ViewModel object that survives configuration changes of PersonalInfoHistory fragment.
 *
 * @property db the firebase database.
 * @property emailID the emailID of the user.
 */
class PersonalInfoViewModelFactory (val db: FirebaseFirestore, val emailID: String): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PersonalInfoViewModel::class.java)) {
            return PersonalInfoViewModel(db, emailID) as T
        }
        throw IllegalArgumentException("Unknown view class")
    }
}