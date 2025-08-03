package question01

class TemporaryStaff(name: String, id: Int, val duration: Int) : Employee(name, id) {
       override fun showDetails() {
               println("Temporary Staff - Name: $name, ID: $id, Duration: $duration months")
           }

       fun workType() {
               println("Temporary staff works on a contract basis.")
           }
}
