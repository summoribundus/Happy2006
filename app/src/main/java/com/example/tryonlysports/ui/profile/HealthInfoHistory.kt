package com.example.tryonlysports.ui.profile

import com.google.firebase.Timestamp

/**
 * This class is a data class for storing health Info Histories.
 *
 * @property recordTime date and time that the health info is recorded.
 * @property value value of the recorded health info (e.g. '50", the value of the recorded weight).
 * @property valueType type of the recorded health info (e.g. "Weight").
 * @property userName username of the user that the record belongs to.
 *
 * @author Liu Zhixuan
 */
data class HealthInfoHistory(val recordTime: Timestamp?= null,
                             val value: Int?=null,
                             val valueType: String?=null,
                             val userName: String?=null
                            ){
    /**
     * The user id for searching in firebase data store.
     */
    lateinit var id:String
}
