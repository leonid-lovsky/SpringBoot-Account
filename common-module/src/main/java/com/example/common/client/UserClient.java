package com.example.common.client;

import com.example.common.contract.UserContract;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service")
public interface UserClient extends UserContract {

}
