package subtask2

class Abbreviation {

    /**
     * Given two strings, a and b, determine if it's possible to make a equal to b as described.
     * If so, print "YES" on a new line. Otherwise, print "NO".
     * For example, given a = AbcDE and b = ABDE, in a we can convert "b"
     * and delete "c" to match b. If a = AbcDE and b = AFDE, matching is not possible
     * because letters may only be capitalized or discarded, not changed.
     */
    fun abbreviationFromA(a: String, b: String): String {
        var j = 0

        label@for (i in b.indices) {
            while (j in a.indices) {
                if (a[j].toUpperCase() != b[i]) {
                    j++
                    continue
                } else {
                    continue@label
                }
            }
            return "NO"
        }
        return "YES"
    }
}