/*** In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is to convert that string to either lowercase only or uppercase only based on:

 * make as few changes as possible.
 * if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.

 * For example:
 * solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
 * solve("CODe") = "CODE". Uppercase characters > lowercase. Change only the "e" to uppercase.
 * solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
 */


class FixStringCase {

    fun solve(s: String): String {
        val chars = s.toList()
        val (upperCases, notUpperCases) = chars.partition { it.isUpperCase() }
        if (upperCases.size > notUpperCases.size)
            return s.toUpperCase()
        else
            return s.toLowerCase()
    }
}


