package com.example.SpringSwaggerREST.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class User
{

    @Id
    private Long id;
    @ApiModelProperty(notes = "name of the user")
    private String name;
    @ApiModelProperty(notes = "address of the user")
    private String address;
    @ApiModelProperty(notes = "email of the user")
    private String email;
    @ApiModelProperty(notes = "phone no")
    private int ph_no;


}
