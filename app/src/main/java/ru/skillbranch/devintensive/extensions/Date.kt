package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

fun Date.format(pattern:String="HH:mm:ss dd.MM.yy"):String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}
fun Date.add(value:Int, units: TimeUnits=TimeUnits.SECOND): Date{
    var time = this.time
    time += when (units){
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
    }
    this.time = time
    return this
}
enum class TimeUnits{
    SECOND,
    MINUTE,
    HOUR,
    DAY
}

fun Date.humanizeDiff(date:Date = Date()): String {
    TODO()
}
//    val visit = date - lastVisit!!.time
//    var s = visit * SECOND
//    return when(s){
//      in 0..1 -> "только что"
//      in 2..45 -> "несколько секунд назад"
//      in 45..75 -> "минуту назад"
//      in 75..2700 -> "несколько минут назад"
//        else -> "только только был"}
//      in 45мин - 75мин "час назад"
//
//      in     75мин 22ч "N часов назад"
//
//      in     22ч - 26ч "день назад"
//
//      in 26ч - 360д "N дней назад"
//
//      in         >360д "более года назад"









