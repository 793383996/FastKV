package io.fastkv.fastkvdemo.data

import io.fastkv.fastkvdemo.fastkv.GlobalStorage

/**
 * APP使用信息
 */
object UsageData : GlobalStorage("common_storage") {
    var launchCount by int("launch_count")

    // 首次启动时间
    var firstLaunchTime by long("first_launch_time")

    var lastLaunchTime by long("last_launch_time")

    // 首次安装的渠道
    var firstChannel by string("first_channel")

    // 上次安装版本（用于判断本次打开是否版本升级）
    var lastVersion by int("last_version")

    var benchmarkCount by int("benchmark_count")


}