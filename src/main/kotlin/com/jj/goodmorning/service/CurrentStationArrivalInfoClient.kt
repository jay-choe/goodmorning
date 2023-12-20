package com.jj.goodmorning.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name = "current-station-arrival", url = "\${external.current-station-arrival-info}")
interface CurrentStationArrivalInfoClient {

    @RequestMapping(method = [RequestMethod.GET], value = ["/{search}"])
    fun get() : Map<String, Any>
}