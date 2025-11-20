package com.example.common.client;

import com.example.common.contract.AuthContract;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "auth-service")
public interface AuthClient extends AuthContract {

}
