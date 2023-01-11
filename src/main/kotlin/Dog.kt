class Dog(food: String, location: String,val noise: String) : Animal(food, location) {
 override fun makenoise() {
  println("Dog make a sound $noise.")
 }
 override fun eat() {
  println("Dog eat $food in $location.")
 }
}