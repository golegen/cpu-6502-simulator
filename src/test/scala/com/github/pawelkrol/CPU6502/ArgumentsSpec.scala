package com.github.pawelkrol.CPU6502

import org.scalatest.FunSpec

import java.io.File

class ArgumentsSpec extends FunSpec {

  describe("validate") {
    it("fails to validate missing file name") {
      intercept[IllegalArgumentException] {
        Arguments().validate
      }
    }

    it("fails to validate non-existing file name") {
      intercept[IllegalArgumentException] {
        Arguments(file = Some(new File("main.prg"))).validate
      }
    }
  }
}
