import sbt.Def.settings


name := "spark-streaming-example"

version := "0.1"

val sparkVersion = "3.1.2"

scalaVersion := "2.12.14"

settings(
  inThisBuild(List(
    organization := "com.thoughtworks",
    scalaVersion := "2.12.14",
    version := "0.1.0-SNAPSHOT"
  )),

  name := "tw-pipeline",
  libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion,
    "org.apache.spark" %% "spark-streaming" % sparkVersion,
    "org.apache.bahir" %% "spark-streaming-twitter" % "2.4.0",
    "com.typesafe" % "config" % "1.3.2",
    "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )
)


