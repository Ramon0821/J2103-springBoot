package com.qf.sb2103.pojo;

import lombok.*;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    private String dNo;
    private String dName;
    private String loc;

}
