package com.huan.test.main

import org.apache.spark.{SparkConf, SparkContext}

import scala.Predef.any2stringadd
import scala.collection.mutable.ArrayBuffer

object Test03 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setMaster("local").setAppName("count")
    val sc = new SparkContext(conf)
    val lines = sc.textFile("F:\\workspace\\scalespace\\myscala\\src\\main\\java\\com\\huan\\test\\data\\weather.txt")

    val t = lines
      .map({ word => (word.substring(0, 7), word.substring(word.length - 3, word.length - 1) + "-" + word.substring(9, 10)) })
      .sortBy(x => x._1, false)
      .reduceByKey((pre, after) => {
        pre + after
      }).foreach(println)


    /*  val rdd1 = sc.makeRDD(List(lines.map()))
      val rdd2 = rdd1.countByValue()
      rdd2.foreach(println)*/
    sc.stop()
  }
}
