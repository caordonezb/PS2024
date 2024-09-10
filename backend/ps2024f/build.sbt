name := """PS2024F"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.14"

libraryDependencies += guice
libraryDependencies += "org.postgresql" % "postgresql" % "42.5.1"