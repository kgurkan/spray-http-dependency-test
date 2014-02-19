
import spray.http._

object Main extends App {
	
	val uri = Uri.from(scheme = "http", host = "example.com")

	println(uri)
}