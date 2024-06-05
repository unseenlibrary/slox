package com.paolobroglio.lox.interpreter.model.scanner

object TokenType extends Enumeration {
  type TokenType = Value

  val LeftParen: TokenType = Value("(")
  val RightParen: TokenType = Value(")")
  val LeftBrace: TokenType = Value("{")
  val RightBrace: TokenType = Value("}")
  val Comma: TokenType = Value(",")
  val Dot: TokenType = Value(".")
  val Minus: TokenType = Value("-")
  val Plus: TokenType = Value("+")
  val SemiColon: TokenType = Value(";")
  val Slash: TokenType = Value("/")
  val Star: TokenType = Value("*")
  val Bang: TokenType = Value("!")
  val BangEqual: TokenType = Value("!=")
  val Equal: TokenType = Value("=")
  val EqualEqual: TokenType = Value("==")
  val Greater: TokenType = Value(">")
  val GreaterEqual: TokenType = Value(">=")
  val Lesser: TokenType = Value("<")
  val LesserEqual: TokenType = Value("<=")
  val Identifier: TokenType = Value("id")
  val StringLiteral: TokenType = Value("string")
  val NumberLiteral: TokenType = Value("number")
  val And: TokenType = Value("and")
  val Class: TokenType = Value("class")
  val Else: TokenType = Value("else")
  val False: TokenType = Value("false")
  val True: TokenType = Value("true")
  val Function: TokenType = Value("fun")
  val For: TokenType = Value("for")
  val If: TokenType = Value("if")
  val Nil: TokenType = Value("nil")
  val Or: TokenType = Value("or")
  val Print: TokenType = Value("print")
  val Return: TokenType = Value("return")
  val Super: TokenType = Value("super")
  val This: TokenType = Value("this")
  val Var: TokenType = Value("var")
  val While: TokenType = Value("while")
  val Eof: TokenType = Value("eof")
}
