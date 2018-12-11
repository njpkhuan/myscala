package com.huan.test.main

import com.huan.test.model.{UserRegister, UserRegisterTempelete}

import scala.util.Random
import java.text.SimpleDateFormat
import java.util.Calendar

import scala.collection.JavaConversions.seqAsJavaList

object Test01 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 4) {
      var user = new UserRegister
      var cal = Calendar.getInstance
      //设置用户ID
      user.userId = i
      //设置用户手机
      user.tel = UserRegisterTempelete.tel.apply(i % 4) + Random.nextInt()
      //设置性别
      user.gender = UserRegisterTempelete.GenderEnum((i + math.abs(Random.nextInt())) % 2).toString
      //设置生日
      cal.set(1980 + i % 20, 0 + i % 12, 1 + i % 28)
      var time = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime)
      user.birthday = time
      //设置ip
      user.regIp = UserRegisterTempelete.regIp.get(i%4)
      //设置系统版本
      user.sysVersion = UserRegisterTempelete.sysVersion.get("ios").get
      //设置版本
      user.softVersion = UserRegisterTempelete.softVersion.take(1).toString()
      println(user.toString)
    }
  }
}
