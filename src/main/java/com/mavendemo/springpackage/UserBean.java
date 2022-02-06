package com.mavendemo.springpackage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Component
public class UserBean {
    private Integer ID;
    private String name;

    public void hello() {
        System.out.println("hello!!");
    }
}
