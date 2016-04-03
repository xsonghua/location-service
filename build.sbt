//enablePlugins(JavaServerAppPackaging)

name := "location-service"

version := "0.2"

organization := "com.oracle"

scalaVersion := "2.11.7"

resolvers ++= Seq("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
                  "Spray Repository"    at "http://repo.spray.io"
                  )


libraryDependencies ++= {
  val akkaVersion       = "2.3.9"
  val sprayVersion      = "1.3.2"
  Seq(
    "com.typesafe.akka" %% "akka-actor"      % akkaVersion,
    "io.spray"          %% "spray-can"       % sprayVersion,
    "io.spray"          %% "spray-routing"   % sprayVersion,
    "io.spray"          %% "spray-json"      % "1.3.1",
    "com.typesafe.akka" %% "akka-slf4j"      % akkaVersion,
    "ch.qos.logback"    %  "logback-classic" % "1.1.2",
    "com.typesafe.akka" %% "akka-testkit"    % akkaVersion  % "test",
    "io.spray"          %% "spray-testkit"   % sprayVersion % "test",
    "org.specs2"        %% "specs2"          % "2.3.13"     % "test")
}

resolvers += "amateras-repo" at "http://amateras.sourceforge.jp/mvn/"

unmanagedBase := file("lib")

libraryDependencies += "jp.sf.amateras.solr.scala" %% "solr-scala-client" % "0.0.12"

libraryDependencies += "org.json4s" % "json4s-jackson_2.11" % "3.2.9"

libraryDependencies += "org.json4s" % "json4s-native_2.11" % "3.2.9"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.2" % "provided"

libraryDependencies += "org.apache.spark" % "spark-graphx_2.11" % "1.5.2" % "provided"

libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "1.5.2" % "provided"

libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "1.5.2" % "provided"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.12"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

// Assembly settings
//mainClass in Global := Some("com.oracle.knowledge.service.Main")

//jarName in assembly := "location-service"
