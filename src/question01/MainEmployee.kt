package question01

fun main() {
       val temp = TemporaryStaff("James", 101, 6)
       val perm = PermanentStaff("Sophie", 102, "HR")

       temp.showDetails()
       temp.workType()

       println()

       perm.showDetails()
       perm.benefits()
}
