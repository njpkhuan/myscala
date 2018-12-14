package com.huan.test.model

class UserRegister {
  //用户ID
  var userId = 1
  //手机号  数组存储
  var tel = 1
  //性别 枚举存储
  var gender = ""
  //生日
  var birthday = ""
  //注册 ip 链表实现
  var regIp = 1
  //系统版本 set实现
  var sysVersion = ""
  //软件版本 map实现
  var softVersion = ""
  //注册时间
  var regTime = 1

  override def toString: String =
    "userId:"+userId+
    "tel:"+tel+
    "gender:"+gender+
    "birthday:"+birthday+
    "regIp:"+regIp+
    "sysVersion:"+sysVersion+
    "softVersion:"+softVersion+
    "regTime:"+regTime
}
