package com.ayi.curso.rest.serv.app.service;


import com.ayi.curso.rest.serv.app.dto.request.persons.PersonDTO;
import com.ayi.curso.rest.serv.app.dto.response.persons.PersonResponseDTO;

import java.util.List;

public interface IPersonService {

    PersonResponseDTO savePerson(PersonDTO personDTO);

    List<PersonResponseDTO> findAllPersons();

    PersonResponseDTO findPersonById(Long idPerson);

    void delete(Long idPerson);
}