package io.fastkv.fastkvdemo.fastkv.kvbase

import io.fastkv.FastKV
import io.fastkv.fastkvdemo.base.AppContext
import io.fastkv.fastkvdemo.fastkv.kvdelegate.KVData
import io.fastkv.fastkvdemo.manager.PathManager

/**
 * 根据服务器环境（正式服/测试服，或者线上环境/开发环境）,区分目录
 */
open class EnvironmentKV(private val name: String) : KVData() {
    override val kv: FastKV by lazy {
        val path = PathManager.fastKVDir +"/"+AppContext.env.tag
        FastKV.Builder(path, name)
            .encoder(encoders())
            .build()
    }
}
