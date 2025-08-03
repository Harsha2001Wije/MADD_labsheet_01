fun whoAmI(value: Any): String {
      return value::class.simpleName ?: "Unknown"
}

fun main() {
     println(whoAmI(42))         // Int
     println(whoAmI("Hello"))    // String
     println(whoAmI(3.14))       // Double
     println(whoAmI(true))       // Boolean
}
