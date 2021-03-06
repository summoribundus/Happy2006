package com.example.tryonlysports.ui.profile

import android.util.Log
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.SimpleDateFormat
import java.util.*

/**
 * This is the util function to bind the WorkoutHistory date to the display text.
 *
 * @param item the WorkoutHistory object to be bound into a text field.
 */
@BindingAdapter("dateWorkoutHistoryText")
fun TextView.setDateWorkoutHistoryText(item: WorkoutHistory) {
    val date = item.date?.seconds?.let { it1 -> Date(it1.toLong()*1000) }
    val sfd = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
    val date1 = sfd.format(date)
    text = date1
}

/**
 * This is the util function to bind the WorkoutHistory workout type to the display text.
 *
 * @param item the WorkoutHistory object to be bound into a text field.
 */
@BindingAdapter("typeWorkoutHistoryText")
fun TextView.setTypeWorkoutHistoryText(item: WorkoutHistory) {
    text = item.workoutType.toString()
}

/**
 * This is the util function to bind the WorkoutHistory average speed to the display text.
 *
 * @param item the WorkoutHistory object to be bound into a text field.
 */
@BindingAdapter("speedWorkoutHistoryText")
fun TextView.setSpeedWorkoutHistoryText(item: WorkoutHistory) {
    text = item.avgSpeed.toString()
}

/**
 * This is the util function to bind the WorkoutHistory duration to the display text.
 *
 * @param item the WorkoutHistory object to be bound into a text field.
 */
@BindingAdapter("durationWorkoutHistoryText")
fun TextView.setDurationWorkoutHistoryText(item: WorkoutHistory) {
    text = item.duration.toString()
}

/**
 * This is the util function to bind the WorkoutHistory total calories to the display text.
 *
 * @param item the WorkoutHistory object to be bound into a text field.
 */
@BindingAdapter("caloriesWorkoutHistoryText")
fun TextView.setCaloriesWorkHistoryText(item: WorkoutHistory) {
    text = item.calories.toString()
}

/**
 * This is the util function to bind the WorkoutHistory total distance to the display text.
 *
 * @param item the WorkoutHistory object to be bound into a text field.
 */
@BindingAdapter("distanceWorkoutHistoryText")
fun TextView.setDistanceWorkoutHistoryText(item: WorkoutHistory) {
    text = item.distance.toString()
}

/**
 * This is the util function to bind the HealthInfoHistory record time to the display text.
 *
 * @param item the HealthInfoHistory object to be bound into a text field.
 */
@BindingAdapter("dateWeightHistoryListText")
fun TextView.setDateWeightHistoryListText(item: HealthInfoHistory) {
    val date = item.recordTime?.seconds?.let { it1 -> Date(it1.toLong()*1000) }
    val sfd = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
    val date1 = sfd.format(date)
    Log.i("systemdateconverted", date1)
    text = date1
}

/**
 * This is the util function to bind the HealthInfoHistory weight history to the display text.
 *
 * @param item the HealthInfoHistory object to be bound into a text field.
 */
@BindingAdapter("weightHistoryListText")
fun TextView.setWeightHistoryListText(item: HealthInfoHistory) {
    text = item.value.toString()
}

/**
 * This is the util function to bind the ScheduleHistory description to the display text.
 *
 * @param item the ScheduleHistory object to be bound into a text field.
 */
@BindingAdapter("description")
fun TextView.setDescription(item: ScheduleHistory) {
    text = item.description
}

/**
 * This is the util function to bind the ScheduleHistory location to the display text.
 *
 * @param item the ScheduleHistory object to be bound into a text field.
 */
@BindingAdapter("location")
fun TextView.setLocation(item: ScheduleHistory) {
    text = item.location
}

/**
 * This is the util function to bind the ScheduleHistory startDateTime to the display text.
 *
 * @param item the ScheduleHistory object to be bound into a text field.
 */
@BindingAdapter("starttime")
fun TextView.setStartTime(item: ScheduleHistory) {
    val date = item.startDateTime?.seconds?.let { it1 -> Date(it1.toLong()*1000) }
    val sfd = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
    val date1 = sfd.format(date)
    text = date1
}

/**
 * This is the util function to bind the ScheduleHistory endDateTime to the display text.
 *
 * @param item the ScheduleHistory object to be bound into a text field.
 */
@BindingAdapter("endtime")
fun TextView.setEndTime(item: ScheduleHistory) {
    val sfd = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
    val date2 = item.endDateTime?.seconds?.let { it1 -> Date(it1.toLong()*1000) }
    val date3 = sfd.format(date2)
    text = date3
}
