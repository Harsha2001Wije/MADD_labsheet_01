fun greetings(name: String, age: Int) {
       println("Hello $name! You are $age years old.")
       if (age >= 18) {
               println("You are eligible for a driving license.")
           } else {
               println("Sorry, you are not eligible for a driving license.")
           }
}

fun main() {
       greetings("Dave", 20)
       greetings("Elisa", 16)
}
