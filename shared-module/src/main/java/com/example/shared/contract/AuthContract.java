package com.example.shared.contract;

import com.example.shared.dto.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface AuthContract {

    @RequestMapping(method = RequestMethod.POST, value = "register")
    AuthResponseRegister register(@RequestBody AuthRequestRegister request);

    @RequestMapping(method = RequestMethod.POST, value = "login")
    AuthResponseLogin login(@RequestBody AuthRequestLogin request);

    @RequestMapping(method = RequestMethod.POST, value = "logout")
    AuthResponseLogout logout(@RequestBody AuthRequestLogout request);

    @RequestMapping(method = RequestMethod.POST, value = "refresh-token")
    AuthResponseRefreshToken refreshToken(@RequestBody AuthRequestRefreshToken request);
}
