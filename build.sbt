name := "miniool-scala"

version := "0.2"

scalaVersion := "2.13.3"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest"       % "3.2.2" % Test
)
