package io.fastkv.fastkvdemo.data

import io.fastkv.fastkvdemo.fastkv.EnvStorage

/**
 * 远程设置
 *
 * 从服务端拉取的配置项，需要区分环境
 */
object RemoteSetting : EnvStorage("remote_setting") {
    val showGuide by boolean("show_guide")

    val setting by combineKey("setting")
}