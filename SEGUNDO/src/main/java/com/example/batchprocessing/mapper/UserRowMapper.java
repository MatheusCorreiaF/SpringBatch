package com.example.batchprocessing.mapper;

import com.example.batchprocessing.model.Objeto;
import com.example.batchprocessing.model.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class UserRowMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

        Person person = new Person();
        Objeto objeto = new Objeto();

        ObjectMapper mapper = new ObjectMapper();

        String objetoString = rs.getString("objeto");
        try {
            objeto = mapper.readValue(objetoString, Objeto.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        /*ObjectMapper mapper = new ObjectMapper();
        try {
            Map<String,Object> map = mapper.readValue(objetoString, Map.class);
            objeto.setSerial((String) map.get("serial"));
            objeto.setFailCount((String) map.get("failCount"));

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/

        person.setObjeto(objeto);
        person.setFirstName(rs.getString("first_name"));
        person.setLastName(rs.getString("last_name"));

        return person;
    }

}