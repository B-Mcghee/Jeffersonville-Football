import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpClientModule} from '@angular/common/http';
import { Item } from '../shared/item.model';


@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css'],
  providers:[HttpClientModule]
})
export class ItemComponent implements OnInit {
  items = [];
  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.getAllItems();
    
    
  }
  getAllItems(){
     this.http.get('http://localhost:8080/api/redpride/item').subscribe(
       items => {
         console.log(items);
       }
     );
  }
}
