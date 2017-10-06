import $ivy.`io.circe::circe-core:0.9.0-M1`
import $ivy.`io.circe::circe-generic:0.9.0-M1`
import $ivy.`io.circe::circe-literal:0.9.0-M1`
import $ivy.`io.circe::circe-parser:0.9.0-M1`
import $ivy.`io.circe::circe-generic-extras:0.9.0-M1`
import $ivy.`org.http4s::http4s-dsl:0.18.0-M2`
import $ivy.`org.http4s::http4s-circe:0.18.0-M2`
import $ivy.`org.http4s::http4s-blaze-server:0.18.0-M2`
import $ivy.`org.http4s::http4s-blaze-client:0.18.0-M2`
import $ivy.`org.tpolecat::doobie-core:0.5.0-M8`
import $ivy.`org.tpolecat::doobie-hikari:0.5.0-M8`
import $ivy.`org.tpolecat::doobie-postgres:0.5.0-M8`
import $ivy.`org.typelevel::cats-core:1.0.0-MF`
import $ivy.`org.typelevel::cats-effect:0.4`
import $ivy.`co.fs2::fs2-core:0.10.0-M6`
import $ivy.`com.github.nscala-time::nscala-time:2.16.0`

import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._
import io.circe.generic.extras._, io.circe.syntax._
import cats._, cats.effect._, cats.data._, cats.implicits._
import org.http4s._, org.http4s.dsl._, org.http4s.circe._, org.http4s.dsl.io._
import fs2._
import com.github.nscala_time.time.Imports._
