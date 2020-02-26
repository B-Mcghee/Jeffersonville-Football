import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpClientModule} from '@angular/common/http';
import { Item } from '../shared/item.model';
import {map } from 'rxjs/operators';


@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
  
})
export class ItemComponent implements OnInit {
  itemsArray:Item[] = [];
  constructor(private http:HttpClient) { }
  ngOnInit() {
    this.getAllItems();
    
    
  }
  private getAllItems(){
    
    this.http.get< {[key:string]:Item}>('http://localhost:8080/api/redpride/item')
    .pipe(map((items) => {
      const array: Item[] = [];

      for(const key in items){
        if(items.hasOwnProperty){
          array.push(items[key]);
          
          }
          
        }
        console.log(array);
       return array;
    }))
    .subscribe(
      items => {
        this.itemsArray = items;
      }
    );
  }
}
