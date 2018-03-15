package com.xiaokele.kotlindemo.bean

/**
 * Created by QiyiLive on 2018/3/13.
 */
class User {
/**
 * 这里只为了展示，单例在Kotlin有更简单的方法实现，只要在 package 级别创建一个 object 即可
 *
 * */
    companion object {
        @Volatile var instance: User? = null
            get() {
                if (field == null) {
                    synchronized(lock = User::class.java) {
                        if (field == null)
                            field = User()
                    }
                }
                return field
            }
    }
    var name: String? = null
    var age: String? = null
}