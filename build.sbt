name := "lab5_actors"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.8",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.8" % Test,
  "org.scala-lang" % "scala-actors" % "2.11.7",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)