spray-http-dependency-test
==========================

An example project for testing spray's dependencies.

The aim of the project is to show an evidence that spray's http component *IS*, in fact, depends on [Akka](http://akka.io). The code should compile under Scala version 2.10.3 and sbt 0.13.1 but fail to run successfuly.

Sample execution logs are available under execution-samples/ directory.

Running
-----------
Just clone the project and run via [sbt](http://www.scala-sbt.org) like this:

``` > sbt run```
