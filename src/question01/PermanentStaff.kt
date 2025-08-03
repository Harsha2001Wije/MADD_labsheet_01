package question01

class PermanentStaff(name: String, id: Int, val department: String) : Employee(name, id) {
       override fun showDetails() {
               println("Permanent Staff - Name: $name, ID: $id, Department: $department")
           }

       fun benefits() {
               println("Permanent staff receives full benefits.")
           }
}

