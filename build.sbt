name := "spray-test"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies += "io.spray" % "spray-http" % "1.2.0"

resolvers += "Spray repo" at "http://repos.spray.io"


// /////////////////////////////////////////
// Uncomment below to import akka and watch
// "application" works
// /////////////////////////////////////////

// resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 
// libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.2.3"