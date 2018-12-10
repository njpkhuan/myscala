package com.huan.test.model

/**
  * 映射Mysql用户注册表
  */
object UserRegisterTempelete {
  //用户ID
  var userId = 1
  //手机号  数组存储
  val tel = Array[Int](158, 183, 177, 180)
  //性别 枚举存储
  var gender = ""
  //生日
  var birthday = ""
  //注册 ip 链表实现
  var regIp = List(192, 172, 122, 168)
  //系统版本 set实现
  var sysVersion = Map(
    "ios" -> "10.1",
    "android" -> "2.1",
  )
  //软件版本 map实现
  var softVersion = Set("1.0.1 ", "1.0.2", "1.0.3")
  //注册时间
  var regTime = AnyRef

  /**
    * 定义性别的枚举类
    */
  object GenderEnum extends Enumeration {
    type TelEnum = Value
    //女
    val male = Value("女")
    //男
    val feMale = Value("男")

    def getRandomSex(randomSex: Int): Unit = {
      randomSex match {
        case 0 => println(GenderEnum.male)
        case 1 => println(GenderEnum.feMale)
        case _ => GenderEnum.Value("no match")
      }
    }
  }
}
