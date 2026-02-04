package com.vti.backend.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/helloworld")
public class HelloController {

    /* a. Tạo Class HelloController trong dự án, viết phương thức: getHello(),
    phương thức này trả vể đoạn Text “Hello World” khi được gọi. Sử dụng Postman để Test kết quả.*/

    @GetMapping()
    public String getHello() {
        return "Hello";
    }

    /* b. Thực hiện chỉnh sửa phương thức getHello() bên trên, cho đầu vào là 1 Tên nào đó, và khi
    trả về kết quả “Hello+ tên_truyền_vào”. Sử dụng Postman để Test kết quả.*/

    @GetMapping(params = "name")
    public String getHello2(@RequestParam String name){
        return "Hello "+ name;
    }
}
