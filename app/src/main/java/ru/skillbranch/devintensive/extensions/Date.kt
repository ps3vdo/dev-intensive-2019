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
    val visit = date.time - this.time
    val s = visit / 1000L
    val visiters: String = if (s > 0) when(s){
        in 0..1 -> "только что"
        in 2..45 -> "несколько секунд назад"
        in 45..75 -> "минуту назад"
        in 75..2700 -> "несколько минут назад"
        in 2701..4500 ->"час назад"
        in 4501..14400 ->"${s/60/60} часа назад"
        in 14401..79200 ->"${s/60/60} часов назад"
        in 79201..93600 ->"день назад"
        in 93601..345600 ->"${s / 60 / 60 / 24} дня назад"
        in 345601..31104000 ->"${s/60/60/24} дней назад"
        else -> "более года назад"}
    else "неучтенка"

    return visiters


    /*when(s){
            in 0..1 -> "только что"
            in 2..45 -> "несколько секунд назад"
            in 45..75 -> "минуту назад"
            in 75..2700 -> "несколько минут назад"
            in 2701..4500 ->"час назад"
            in 4501..79200 ->"N часов назад"
            in 79201..93600 ->"день назад"
            in 93601..31104000 ->"N дней назад"
             31104001 ->"более года назад"

      else -> "только только был"}*/
//
//      in     75мин 22ч "N часов назад"
//
//      in     22ч - 26ч "день назад"
//
//      in 26ч - 360д "N дней назад"
//
//      in         >360д "более года назад"
}








