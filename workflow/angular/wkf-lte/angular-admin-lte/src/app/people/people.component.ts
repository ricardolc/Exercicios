import { Component, OnInit } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { Http, Response, Headers} from '@angular/http'; 

@Component({
  selector: 'app-people',
  templateUrl: './people.component.html',
  styleUrls: ['./people.component.css']
})
export class PeopleComponent implements OnInit {

  constructor(private http: Http) { }
//
  peopleObj:object = {};
  url:string = "http://localhost:8090/service/pessoa";

  addNewPeople = function(people) { 
    this.peopleObj = {
      "nome" : people.nome,
      "ativo" : people.ativo 
    }

    this.http.post(this.url, this.peopleObj).subscribe ((res:Response) => 
      {
        console.log(res);
        console.log(res);
      })

  }



  ngOnInit() {
  }

}
