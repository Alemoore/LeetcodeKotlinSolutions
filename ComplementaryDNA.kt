import java.lang.IllegalArgumentException

/*** Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
 * for the development and functioning of living organisms.
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
 * You have a function with one side of the DNA; you need to get the other complementary side.
 * DNA strand is never empty or there is no DNA at all.
 */

class ComplementaryDNA {
    fun makeComplement(dna: String): String =
        dna.map {
            when (it) {
                'A' -> 'T'
                'T' -> 'A'
                'C' -> 'G'
                'G' -> 'C'
                else -> throw IllegalArgumentException("It is not DNA!")
            }
        }.joinToString(separator = "")

}

