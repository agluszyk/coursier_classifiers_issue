
import play.sbt.PlayImport.PlayKeys._
import play.routes.compiler.InjectedRoutesGenerator
import play.sbt.routes.RoutesKeys._
import play.twirl.sbt.Import._
import sbt.Keys._
import sbt._

name := """coursier_classifiers_issue_b"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.2"

libraryDependencies := Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test,
  "com.example" %% "coursier_classifiers_issue_a" % "1.0-SNAPSHOT",
  "com.example" %% "coursier_classifiers_issue_a" % "1.0-SNAPSHOT" classifier "assets"
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"

