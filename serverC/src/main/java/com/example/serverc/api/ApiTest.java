package com.example.serverc.api;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "用户服务",description = "用户的基本操作")
public class ApiTest {
    @ApiOperation(value = "根据查询条件获取用户信息")
    @RequestMapping(value = "/findOneByCondition",method = RequestMethod.POST)
    public User findOneByCondition() {

        return null;
    }

    @ApiModel(value = "用户实体")
    public class User {

        public User(Integer userId, String userName, String password, String email, String birthDate) {
            this.userId = userId;
            this.userName = userName;
            this.password = password;
            this.email = email;
            this.birthDate = birthDate;
        }

        @ApiModelProperty(name = "用户id",dataType = "String" ,notes = "用户Id")
        private Integer userId;

        @ApiModelProperty(name = "用户名",dataType = "String" ,notes="用户名")
        private String userName;
        @ApiModelProperty(name = "密码",dataType = "String",notes = "密码")
        private String password;
        @ApiModelProperty(name = "邮箱",dataType = "String" ,notes = "邮箱")
        private String email;
        @ApiModelProperty(name = "生日",dataType = "String" ,notes = "生日")
        private String birthDate;
}
}