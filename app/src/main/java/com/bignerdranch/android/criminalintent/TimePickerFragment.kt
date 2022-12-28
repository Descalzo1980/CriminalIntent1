//package com.bignerdranch.android.criminalintent
//
//import android.app.Dialog
//import android.app.TimePickerDialog
//import android.icu.util.Calendar
//import android.os.Bundle
//import android.text.format.DateFormat
//import android.widget.TimePicker
//import androidx.fragment.app.DialogFragment
//import java.util.*
//
//private const val ARG_DATE = "time"
//
//class TimePickerFragment : DialogFragment(), TimePickerDialog.OnTimeSetListener {
//
//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        val c = Calendar.getInstance()
//        val hour = c.get(Calendar.HOUR_OF_DAY)
//        val minute = c.get(Calendar.MINUTE)
//        return TimePickerDialog(activity, this, hour, minute, DateFormat.is24HourFormat(activity))
//    }
//
//    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
//
//    }
//
//    companion object{
//        fun newInstance(date: Date): TimePickerFragment{
//            val args = Bundle().apply {
//                putSerializable(ARG_DATE,date)
//            }
//            return TimePickerFragment().apply {
//                arguments = args
//            }
//        }
//    }
//}
