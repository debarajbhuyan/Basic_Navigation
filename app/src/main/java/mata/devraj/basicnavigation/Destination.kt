package mata.devraj.basicnavigation

interface Destination {
    val route: String
}

object Home : Destination {
    override val route = "Home"
}
object Screen1 : Destination {
    override val route = "Screen1"
}
object Screen2 : Destination {
    override val route = "Screen2"
}