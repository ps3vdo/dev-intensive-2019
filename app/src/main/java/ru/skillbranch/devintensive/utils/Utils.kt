package ru.skillbranch.devintensive.utils


object Utils {
    fun parseFullName(fullName:String?): Pair<String?, String?>{
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = " "){
        payload.replace(Regex("абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ")){
            when (it.value){
                 "а"->"a"
                 "б"->"b"
                 "в"->"v"
                 "г"->"g"
                 "д"->"d"
                 "e"->"e"
                 "ё"->"yo"
                 "ж"->"zh"
                 "з"->"z"
                 "и"->"i"
                 "й"->"j"
                 "к"->"k"
                 "л"->"l"
                 "м"->"m"
                 "н"->"n"
                 "о"->"o"
                 "п"->"p"
                 "р"->"r"
                 "с"->"s"
                 "т"->"t"
                 "у"->"u"
                 "ф"->"f"
                 "х"->"x"
                 "ц"->"cz"
                 "ч"->"ch"
                 "ш"->"sh"
                 "щ"->"shh"
                 "ы"->"y`"
                 "ъ"->"``"
                 "ь"->"`"
                 "э"->"e`"
                 "ю"->"yu"
                 "я"->"ya"
                 "А"->"A"
                 "Б"->"B"
                 "В"->"V"
                 "Г"->"G"
                 "Д"->"D"
                 "Е"->"E"
                 "Ё"->"Yo"
                 "Ж"->"Zh"
                 "З"->"Z"
                 "И"->"I"
                 "Й"->"J"
                 "К"->"K"
                 "Л"->"L"
                 "М"->"M"
                 "Н"->"N"
                 "О"->"O"
                 "П"->"P"
                 "Р"->"R"
                 "С"->"S"
                 "Т"->"T"
                 "У"->"U"
                 "Ф"->"F"
                 "Х"->"X"
                 "Ц"->"Cz"
                 "Ч"->"Ch"
                 "Ш"->"Sh"
                 "Щ"->"Shh"
                 "Ы"->"Y`"
                 "Ъ"->"``"
                 "Ь"->"`"
                 "Э"->"E`"
                 "Ю"->"Yu"
                 "Я"->"Ya"
                 " "->"$divider"
                else -> it.value
            }
        }


    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        val fName = firstName?.first().toString()
        val lName = lastName?.first().toString()
        return "$fName$lName"
    }
}