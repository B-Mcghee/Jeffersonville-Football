import {v4 as uuidv4} from 'uuid'
export class Item {
    
    constructor(
        public id:uuidv4,
        public category:number, 
        public title:string, 
        public size:string, 
        public price:number, 
        public description:string){}
}