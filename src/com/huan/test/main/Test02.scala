package com.huan.test.main

object Test02 {
  def main(args: Array[String]): Unit = {
    //    print(d1(f, 1, 2))
    //    print(d2(1, 2)(3, 4, 5))
    print(d3(f3)(1, 2))
  }

  //  函数的参数是函数
  def d1(f: (Int, Int, Int) => Int, a: Int, b: Int): Int = {
    f(a, 10, b)
  }

  def f(v1: Int, v2: Int, v3: Int): Int = {
    v1 + v2 + v3
  }

  //  函数的返回是函数

  def d2(a: Int, b: Int): (Int, Int, Int) => Int = {
    def f2(v1: Int, v2: Int) = {
      v1 + v2 + a + b
    }

    def f2_1(v1: Int, v2: Int, v3: Int) = {
      v1 + v2 + a + b + v3
    }

    f2_1
  }

  //  函数的参数是函数，函数的返回是函数

  def d3(f3: (Int, Int) => Int): (Int, Int) => Int = {
    f3
  }

  def f3(v1: Int, v2: Int): Int = {
    v1 + v2
  }
}
