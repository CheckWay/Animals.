class Cat(food: String,location: String,val noise: String) : Animal(food, location) {
    override fun makenoise() {
        println("Cat make a sound $noise.")
    }
    override fun eat() {
        println("Cat eat $food in $location")
    }
}