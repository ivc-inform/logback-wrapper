
name := "logback-wrapper"

version := "1.5.0.1"

organization := "com.simplesys"

val logbackVersion = "1.2.3"
val scalaTestVersion = "3.0.4"

val logbackClassic = "ch.qos.logback" % "logback-classic" % logbackVersion
val logbackAccess = "ch.qos.logback" % "logback-access" % logbackVersion
val logbackCore = "ch.qos.logback" % "logback-core" % logbackVersion
val scalaTest = "org.scalatest" %% "scalatest" % "3.0.4"

libraryDependencies ++= Seq(
    logbackCore,
    logbackClassic,
    logbackAccess,
    scalaTest % Test
)

scalaVersion := "2.12.5"
