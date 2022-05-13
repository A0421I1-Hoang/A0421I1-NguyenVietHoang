import { Injectable } from '@angular/core';
import {IWord} from '../iword';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {

  list: IWord[] = [
    {
      word: 'Hello',
      mean: 'Xin chào',
    },
    {
      word: 'Goodbye',
      mean: 'Tạm biệt',
    },
    {
      word: 'Song',
      mean: 'Nhạc',
    }
  ];

  constructor() { }

  getAll(){
    return this.list;
  }

  translate(word: string){
    return this.list.find(item => item.word === word);
  }
}
