package com.exampleAuth0.prueba.controller.BaseController;

import com.exampleAuth0.prueba.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<E extends Base, ID extends Serializable> {

    public ResponseEntity<?> getAll();

    public ResponseEntity<?> getOne(@PathVariable ID id);

    public ResponseEntity<?> save(@RequestBody E entity);

    public ResponseEntity<?> update(@RequestBody E entity, @PathVariable ID id);

    public ResponseEntity<?> delete(@PathVariable ID id);
}