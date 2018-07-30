import { Component, OnInit } from '@angular/core';
//https://www.youtube.com/watch?v=HCHvrbAd1QA
import { Http, Response, Headers} from '@angular/http';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styleUrls: ['./crud.component.css']
})
export class CrudComponent implements OnInit {

  constructor(private http: Http) { }

  peoples = [];


  ngOnInit() {
    this.fetchData();

  }
  ////


  fetchData = function() {

    this.http.get("http://localhost:8090/service/pessoa")
        .subscribe (
          (res:Response) => { 
            this.peoples = res.json();
          }

        )
  }




}
