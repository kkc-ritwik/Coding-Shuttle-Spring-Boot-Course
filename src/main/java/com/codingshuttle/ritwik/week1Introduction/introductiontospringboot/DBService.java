package com.codingshuttle.ritwik.week1Introduction.introductiontospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {


//@Autowired
// private DevDB db;
//private DB db;
   final  private DB db;


public DBService (DB db) {
    this.db = db;
}



    String getData() {
//    db = new DevDB();
return db.getData();
    }

}
