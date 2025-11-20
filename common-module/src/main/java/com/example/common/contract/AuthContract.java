package com.example.common.contract;

import com.example.common.dto.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface AuthContract {

    @RequestMapping(method = RequestMethod.POST, value = "/auth/register")
    AuthResponseRegister register(@RequestBody AuthRequestRegister request);

    @RequestMapping(method = RequestMethod.POST, value = "/auth/login")
    AuthResponseLogin login(@RequestBody AuthRequestLogin request);

    @RequestMapping(method = RequestMethod.POST, value = "/auth/logout")
    AuthResponseLogout logout(@RequestBody AuthRequestLogout request);

    @RequestMapping(method = RequestMethod.POST, value = "/auth/refresh-token")
    AuthResponseRefreshToken refreshToken(@RequestBody AuthRequestRefreshToken request);
}
