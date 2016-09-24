package org.singingwizard.macroissues

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object TestMacro {
  def apply(arg: Any): Any = macro TestMacroImpl.impl
}

class TestMacroImpl(val c: Context) {
  import c.universe._
  import c.internal._
  import decorators._

  def impl(arg: Tree): Tree = {
    q"""println("Hello")"""
  }
}
