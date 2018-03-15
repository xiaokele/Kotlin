package com.xiaokele.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * findviewbyid
         * */
        val tvBtn = findViewById<TextView>(R.id.tv_btn)

        /**
         * 控件的点击事件
         * */
        tvBtn.setOnClickListener {
            Toast.makeText(this, "Hello Kotlin!", Toast.LENGTH_SHORT).show()

            /**
             * if..else不变
             * 移除了switch，用when来代替
             * */
            val x = 1
            when (x) {
                in 1..12 -> {
                    Log.e("result", "---x is in the range")
                }
                !in 1..12 -> Log.e("result", "---x is not in the range")
                else -> Log.e("result", "---x none of the above")
            }
        }

        /**
         * 定义函数用fun关键字
         * */
//        //有返回值
//        fun add(a: Int, b: Int): Int {
//            return a + b
//        }
//        //可以简写为
//        fun add(a: Int, b: Int) = a + b
//
//        //没有返回值的函数，显式指定Unit为返回值
//        fun showAddResult(a: Int, b: Int): Unit {
//            println(a + b)
//        }
//
//        //没有返回值的函数，省略Unit的写法
//        fun showAddResult2(a: Int, b: Int) {
//            println(a + b)
//        }

        /**
         * 常量和变量
         * */
//        fun test() {
//            //使用val关键字声明一个常量（只读），声明常量时必须初始化
//            val a: Int = 1 //显式指定常量的类型
//            val b = 2  //自动推断类型
//            val c: Int //声明一个不初始化的常量，必须显式指定类型
//            //b = 3  //常量值不可修改，这句代码会报错
//
//            //a = 3  //不可以修改常量的值，此句代码会报错
//
//            //使用var关键字声明一个变量，变量的值可以修改
//            var year: Int = 2016 //显式指定变量的类型
//            var month = 5 //自动推断变量类型
//            var day: Int //声明一个不初始化的变量，必须显式指定类型
//            month = 6 //变量值可以被修改
//        }

        /**
         * 常量数组int[][][] arrs = new int[3][2][1];
         * */
//        val arrs = Array(3) { Array(2) { IntArray(1) } }
//        //空安全变量
//        var str: String = "hello"
//        //可为空字符串变量
//        var str1: String? = null

        /**
         * 字符串模板
         * */
//        //字符串模板的用法
//        fun stringTempl(args: Array<String>) {
//            if(args.size > 0)
//                println("args[0] = ${args[0]}")
//        }
//
//        //main方法是整个程序的入口
//        fun main(args: Array<String>){
//            var arr = arrayOf("hello", "world")
//            stringTempl(arr)
//        }
//        //输出结果为：args[0]=hello

        /**
         * 条件表达式
         * */
//        //常规写法的条件表达式，这里的函数返回值不能省略
//        fun max(a: Int, b: Int): Int {
//            if (a > b)
//                return a
//            else
//                return b
//        }
//
//        //简写的条件表达式
//        fun max2(a: Int, b: Int) = if (a > b) a else b

        /**
         * while 和 do...while 同Java并无区别，for则有很大改变并多出了几个变种。
         * */
//        val list = ArrayList<String>()
//        //递增for (int i = 0; i < list.size(); i++)
//        for (i in list.indices) {
//            print(list[i])
//        }
//        //递增for (int i = 2; i < list.size(); i++)
//        for (i in 2 until list.size) {
//            print(list[i])
//        }
//        //递减for (int i = list.size(); i >= 0; i--)
//        for (i in list.size downTo 0) {
//            print(list[i])
//        }
//        //操作列表内的对象
//        for (item in list) {
//            print(item)
//        }
//        //加强版
//        for ((i, item) in list.withIndex()) {
//            print(list[i])
//            print(item)
//        }
//        //变种版
//        list.forEach {
//            print(it)
//        }
//
//        list.forEach {
//            print(it)
//        }
//
//        list.forEachIndexed { i, s ->
//            print(list[i])
//            print(s)
//        }
//
//        list.forEachIndexed(object : (Int, String) -> Unit {
//            override fun invoke(i: Int, s: String) {
//                print(list[i])
//                print(s)
//            }
//        })

        /**
         * 万能的冒号
         * */
//        //val表示常量var表示变量声明
//        var name: String = "tutu"
//        //省略类型说明
//        var age = "23"
//        //fun表示函数
//        fun getName(): String{
//            return "tutu"
//        }
//        //类继承
//        class UserList<E>(): ArrayList<E>() {
//            //...
//        }
//        //使用Java类的时候
//        val intent = Intent(this, MainActivity::class.java)

        /**
         * @的使用
         * */
//        class User {
//            inner class State{
//                fun getUser(): User{
//                    //返回User
//                    return this@User
//                }
//                fun getState(): State{
//                    //返回State
//                    return this@State
//                }
//            }
//        }

        /**
         * 拼接字符串
         * */
//        val user = User()
//        //赋值
//        user.name = "tutu"
//        user.age = "23"
//        //取值
//        val name = user.name
//        val age = user.age
//        var userInfo = "name:${user.name},  age:$age"
//        //输出结果：name:tutu, age:23

        /**
         * 判空
         * */
//        //类型后面加?表示可为空
//        var age: String? = "23"
//        //抛出空指针异常
//        val ageInt = age!!.toInt()
//        //不做处理跳过
//        val ages = age?.toInt()

        /**
         * 可空类型
         * */
//        fun nullableTest() {
//            //在变量类型后面加上问号，代表该变量是可空变量
//            var name: String? = "zhangsan"
//            name = null //可以将null赋值给name变量
//            var person: String = "tom"
//            //person = null  //这句代码会报错，不可以将null赋值给一个不可空变量
//        }

        /**
         * 函数返回值为Int?，表示返回值可为空
         * 当参数为空或者为""时，则返回null，否则使用Java中的字符串转整型的方法
         * 这里也体现了kotlin代码和Java代码无缝集成
         * */
//        fun parseInt(s: String): Int? {
//            if (s == null || s == "")
//                return null;
//            return Integer.parseInt(s);
//        }

        /**
         * 类型检测和自动类型转换
         * 当函数参数为字符串类型时，就返回字符串的长度，否则返回空
         * */
//        fun getStringLength(n: Any): Int? {
//            if (n is String)
//                return n.length //这里会自动将n转化为字符串类型
//            return null
//        }
//        //也可写成
//        fun getStringLength(n: Any): Int? {
//            if(n !is String)
//                return null
//            return n.length //这里会自动将n转化为字符串类型
//        }

        /**
         * for循环和while循环
         * */
//        //for循环的测试代码
//        fun testFor() {
//            var arr = arrayOf(1, 3, 4, 5, 6)
//            for (i in arr.indices) { //通过索引循环
//                println(arr[i])
//            }
//            for (num in arr) { //直接使用数组中的对象循环
//                println(num)
//            }
//        }
//
//        //while循环的测试代码
//        fun testWhile() {
//            var i = 0;
//            while (i < 10) {
//                print(" " + i)
//                i++
//            }
//        }

        /**
         * when表达式
         * */
//        fun main(args: Array<String>) {
//            testCase("hello world")
//        }

        /**
         * ranges的使用
         *
         * 判断分数是否大于等于90，小于等于100
         * */
//        fun isGood(score: Int) {
//            if (score in 90..100) //ranges是闭区间
//                println("very good")
//            else
//                println("not so good")
//        }

        /**
         * 检查index是否在数组arr的索引范围内
         * */
//        fun checkIndex(index: Int, arr: Array<Int>) {
//            if (index in 0..arr.lastIndex) //arr.lastIndex返回的是数组的最后一位的下标
//                println("index in bounds")
//            else
//                println("index out of bounds")
//        }

        /**
         * 遍历一个范围
         * */
//        for (i in 1..5) {
//            println(i)
//        }
//        //in运算符遍历一个字符串数组
//        fun testStr(arr: Array<String>) {
//            for (str in arr)
//                println(str)
//        }
    }

    fun testCase(obj: Any) {
        when (obj) {
            is String -> {
                print("this is string")
            }
            is Int -> {
                print("this is integer")
            }
            else -> {
                print("unkown value")
            }
        }
    }

    /**
     * 注意事项
     *
     * 内部类和参数默认为public，而在Java中为private。
     *
     * 类默认为不可继承(final)，想要可被继承要声明为open或abstract。
     *
     * 取消了static关键字，静态方法和参数统一写在companion object块。
     *
     * internal模块内可见，inner内部类
     *
     * 学习网站
     *
     * Kotlin中文文档：http://www.kotlindoc.cn/
     * Kotlin语言中文站：https://www.kotlincn.net/docs/reference/basic-syntax.html
     *
     * */
}

