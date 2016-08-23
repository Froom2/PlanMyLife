name := "time-off-tracker"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0" % "test"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
