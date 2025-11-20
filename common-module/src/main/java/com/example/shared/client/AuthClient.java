package com.example.shared.client;

import com.example.shared.contract.AuthContract;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "auth-service", path = "/auth")
public interface AuthClient extends AuthContract {

}
