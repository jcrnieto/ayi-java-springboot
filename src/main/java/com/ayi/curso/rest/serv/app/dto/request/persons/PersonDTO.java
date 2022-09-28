package com.ayi.curso.rest.serv.app.dto.request.persons;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ApiModel(
        value = "PersonDTO",
        description = "Represents the data needed to created Persons"
)

public class PersonDTO implements Serializable {

    @ApiModelProperty(position = 1, required = true, notes = "Non negative value, The first name is required.")
    @NotNull
    private String firstName;

    @ApiModelProperty(position = 2, required = true, notes = "Non negative value, The last name is required.")
    @NotNull
    private String lastName;

    @ApiModelProperty(position = 3, required = true, notes = "Non negative value, The type document list is required.")
    @NotNull
    private String typeDocument;

    @ApiModelProperty(position = 4, required = true, notes = "Non negative value, The number document is required.")
    @NotNull
    private Integer numberDocument;

    @ApiModelProperty(position = 5, required = true, notes = "Non negative value, The date Created list is required.")
    @NotNull
    private LocalDate dateCreated;

    @ApiModelProperty(position = 6, notes = "Non negative value, The Date modified list is required.")
    @NotNull
    private LocalDate dateModified;

    @ApiModelProperty(position = 7, required = true, notes = "Non negative value, The number document is required.")
    private LocalDate dateBorn;

}
