package com.example.shared.client;

import com.example.shared.contract.AuthContract;
import com.example.shared.contract.UserContract;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "auth-service")
public interface AuthClient extends AuthContract {

}
