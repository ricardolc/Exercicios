package com.workflow.main;

import java.io.Serializable;

public interface  TodoRepository <T, ID extends Serializable> 
extends CrudRepository<T> {

}
