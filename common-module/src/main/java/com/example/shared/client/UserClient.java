package com.example.shared.client;

import com.example.shared.contract.UserContract;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service")
public interface UserClient extends UserContract {

}
